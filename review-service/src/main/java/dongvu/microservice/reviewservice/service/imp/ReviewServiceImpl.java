package dongvu.microservice.reviewservice.service.imp;

import dongvu.microservice.reviewservice.entity.Review;
import dongvu.microservice.reviewservice.service.ReviewService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {
    @Override
    public List<Review> getListReview() {
        return null;
    }
}
