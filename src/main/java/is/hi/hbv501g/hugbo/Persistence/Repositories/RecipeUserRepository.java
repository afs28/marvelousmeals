package is.hi.hbv501g.hugbo.Persistence.Repositories;
import is.hi.hbv501g.hugbo.Persistence.Entities.RecipeUser;
import org.springframework.data.repository.CrudRepository;

/**
 * The recipe user repository.
 * @Authors: AFS
 *
 */

public interface RecipeUserRepository extends CrudRepository<RecipeUser, Long> {
/*
                                            TO BE RECONFIGURED
 */
    RecipeUser findUserByRecipeUserId(Integer recipeUserId);
}