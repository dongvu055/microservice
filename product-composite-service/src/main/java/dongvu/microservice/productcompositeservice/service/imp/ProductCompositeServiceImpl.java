package dongvu.microservice.productcompositeservice.service.imp;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import dongvu.microservice.productcompositeservice.model.ProductComposite;
import dongvu.microservice.productcompositeservice.service.ProductCompositeService;
import dongvu.microservice.productservice.entity.Product;
import dongvu.microservice.recommendationservice.entity.Recommendation;
import dongvu.microservice.reviewservice.entity.Review;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

@Service
@Slf4j
public class ProductCompositeServiceImpl implements ProductCompositeService {
    @Override
    public ProductComposite getListProductComposite() {
        ProductComposite productComposite = new ProductComposite();
        OkHttpClient okHttpClient = new OkHttpClient();
        Request requestProduct = new Request.Builder()
                .url("http://localhost:8081/getdata")
                .build();

        Request requestRecommendation = new Request.Builder()
                .url("http://localhost:8082/getdata")
                .build();

        Request requestReview = new Request.Builder()
                .url("http://localhost:8083/getdata")
                .build();

        try {
            //Get ListProduct
            Response response = okHttpClient.newCall(requestProduct).execute();
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode jsonNode = objectMapper.readTree(response.body().string());
            Iterator<JsonNode> elements = jsonNode.elements();
            while (elements.hasNext())
            {
                JsonNode node = elements.next();
                Product product = new Product();
                product.setProductId(node.get("productId").asInt());
                product.setName(node.get("name").asText());
                product.setWeight(node.get("weight").asText());
                productComposite.getProduct().add(product);
            }

            //Get List recommendation
            response = okHttpClient.newCall(requestRecommendation).execute();
            objectMapper = new ObjectMapper();
            jsonNode = objectMapper.readTree(response.body().string());
            elements = jsonNode.elements();
            while (elements.hasNext())
            {
                JsonNode node = elements.next();
                Recommendation recommendation = new Recommendation();
                recommendation.setRecommendationId(node.get("recommendationId").asInt());
                recommendation.setProductId(node.get("productId").asInt());
                recommendation.setAuthor(node.get("author").asText());
                recommendation.setRate(node.get("rate").asText());
                recommendation.setContent(node.get("content").asText());
                productComposite.getRecommendations().add(recommendation);
            }

            //Get List review
            response = okHttpClient.newCall(requestReview).execute();
            objectMapper = new ObjectMapper();
            jsonNode = objectMapper.readTree(response.body().string());
            elements = jsonNode.elements();
            while (elements.hasNext())
            {
                JsonNode node = elements.next();
                Review review = new Review();
                review.setReviewId(node.get("reviewId").asInt());
                review.setProductId(node.get("productId").asInt());
                review.setAuthor(node.get("author").asText());
                review.setSubject(node.get("subject").asText());
                review.setContent(node.get("content").asText());
                productComposite.getReviews().add(review);
            }

        } catch (IOException e) {
            log.error(e.getMessage());
            e.printStackTrace();
        }
        return productComposite;
    }
}
