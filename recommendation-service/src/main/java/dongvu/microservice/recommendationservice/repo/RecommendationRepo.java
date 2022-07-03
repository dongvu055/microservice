package dongvu.microservice.recommendationservice.repo;

import dongvu.microservice.recommendationservice.entity.Recommendation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecommendationRepo extends JpaRepository<Recommendation,Integer> {
}
