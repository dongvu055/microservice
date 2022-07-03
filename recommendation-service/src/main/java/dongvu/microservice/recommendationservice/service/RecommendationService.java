package dongvu.microservice.recommendationservice.service;

import dongvu.microservice.recommendationservice.entity.Recommendation;

import java.util.List;

public interface RecommendationService {
    List<Recommendation> getListRecommendation();
}
