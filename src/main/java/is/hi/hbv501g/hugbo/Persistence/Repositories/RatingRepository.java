package is.hi.hbv501g.hugbo.Persistence.Repositories;

import is.hi.hbv501g.hugbo.Persistence.Entities.RecipeRatings;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RatingRepository extends JpaRepository<RecipeRatings, Long> {
}
