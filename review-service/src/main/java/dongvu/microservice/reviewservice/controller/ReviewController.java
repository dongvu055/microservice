package dongvu.microservice.reviewservice.controller;

import dongvu.microservice.reviewservice.entity.Review;
import dongvu.microservice.reviewservice.service.ReviewService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.util.List;

@RestController
public class ReviewController {
    private final ReviewService reviewService;

    ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @GetMapping("/getdata")
    public List<Review> getListReviewComposite() {
        return reviewService.getListReview();
    }

    @GetMapping("/ping")
    public String test() {
        try {
            InetAddress IP = InetAddress.getLocalHost();
            return "pong: " + IP.getHostAddress();
        } catch (Exception e) {
            return e.getMessage();
        }
    }
}
