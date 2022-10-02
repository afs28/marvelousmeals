package is.hi.hbv501g.hugbo.Persistence.Repositories;
import is.hi.hbv501g.hugbo.Persistence.Entities.RecipeUser;
import org.springframework.data.repository.CrudRepository;

/**
 * The recipe user repository.
 * @Authors: AFS
 *
 */
public interface UserRepository extends CrudRepository<RecipeUser, Integer> {
/*
                                            TO BE RECONFIGURED
 */
    RecipeUser findRecipeUserByRecipeUserId(Integer recipeUserId);
}