package dongvu.microservice.productcompositeservice.model;

import dongvu.microservice.productservice.entity.Product;
import dongvu.microservice.recommendationservice.entity.Recommendation;
import dongvu.microservice.reviewservice.entity.Review;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ProductComposite {

    private List<Product> product = new ArrayList<>();
    private List<Review> reviews = new ArrayList<>();
    private List<Recommendation> recommendations = new ArrayList<>();

}
