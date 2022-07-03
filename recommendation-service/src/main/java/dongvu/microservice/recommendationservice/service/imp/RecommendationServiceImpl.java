package dongvu.microservice.recommendationservice.service.imp;

import dongvu.microservice.recommendationservice.entity.Recommendation;
import dongvu.microservice.recommendationservice.repo.RecommendationRepo;
import dongvu.microservice.recommendationservice.service.RecommendationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecommendationServiceImpl implements RecommendationService {
    @Autowired
    private RecommendationRepo recommendationRepo;

    @Override
    public List<Recommendation> getListRecommendation() {
        return recommendationRepo.findAll();
    }
}
