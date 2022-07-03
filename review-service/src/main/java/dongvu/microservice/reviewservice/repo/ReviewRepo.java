package dongvu.microservice.reviewservice.repo;

import dongvu.microservice.reviewservice.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepo extends JpaRepository<Review, Integer> {
}
