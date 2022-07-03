package dongvu.microservice.recommendationservice.controller;

import dongvu.microservice.recommendationservice.entity.Recommendation;
import dongvu.microservice.recommendationservice.service.RecommendationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RecommendationController {
    private final RecommendationService recommendationService;

    RecommendationController(RecommendationService recommendationService) {
        this.recommendationService = recommendationService;
    }

    @GetMapping("/getdata")
    public List<Recommendation> getListRecommendationComposite() {
        return recommendationService.getListRecommendation();
    }
}
