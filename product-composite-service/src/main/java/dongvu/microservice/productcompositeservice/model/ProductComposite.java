package dongvu.microservice.productcompositeservice.model;

import dongvu.microservice.productservice.entity.Product;
import dongvu.microservice.recommendationservice.entity.Recommendation;
import dongvu.microservice.reviewservice.entity.Review;
import lombok.Data;

import java.util.List;

@Data
public class ProductComposite {

    private Product product;
    private List<Review> reviews;
    private List<Recommendation> recommendations;

}
