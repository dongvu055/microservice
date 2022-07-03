package dongvu.microservice.reviewservice.service.imp;

import dongvu.microservice.reviewservice.entity.Review;
import dongvu.microservice.reviewservice.repo.ReviewRepo;
import dongvu.microservice.reviewservice.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {
    @Autowired
    private ReviewRepo reviewRepo;

    @Override
    public List<Review> getListReview() {
        return reviewRepo.findAll();
    }
}
