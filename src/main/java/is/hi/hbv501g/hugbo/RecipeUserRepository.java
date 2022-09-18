package is.hi.hbv501g.hugbo;
import org.springframework.data.repository.CrudRepository;

/**
 * The recipe user repository.
 * @Authors: AFS
 *
 */
public interface RecipeUserRepository extends CrudRepository<RecipeUser, Integer> {

    RecipeUser findRecipeUserByRecipeUserId(Integer recipeUserId);
}