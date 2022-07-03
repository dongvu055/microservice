package dongvu.microservice.recommendationservice.service.imp;

import dongvu.microservice.recommendationservice.entity.Recommendation;
import dongvu.microservice.recommendationservice.service.RecommendationService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecommendationServiceImpl implements RecommendationService {
    @Override
    public List<Recommendation> getListRecommendation() {
        return null;
    }
}
