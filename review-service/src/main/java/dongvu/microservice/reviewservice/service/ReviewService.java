package dongvu.microservice.reviewservice.service;

import dongvu.microservice.reviewservice.entity.Review;

import java.util.List;

public interface ReviewService {
    List<Review> getListReview();
}
