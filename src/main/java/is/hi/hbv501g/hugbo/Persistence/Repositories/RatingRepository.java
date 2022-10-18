package is.hi.hbv501g.hugbo.Persistence.Repositories;

import is.hi.hbv501g.hugbo.Persistence.Entities.RecipeRatings;
import org.springframework.data.repository.CrudRepository;

public interface RatingRepository extends CrudRepository<RecipeRatings, Long> {
}
