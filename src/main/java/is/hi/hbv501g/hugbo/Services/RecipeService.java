package is.hi.hbv501g.hugbo.Services;

import is.hi.hbv501g.hugbo.Persistence.Entities.Recipe;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

public interface RecipeService {

    List<Recipe> findAll();

    List<Recipe> findByTitle(String title);

    Recipe findByID(Long recipeID);
    Recipe saveRecipe(Recipe newRecipe);
    void delete(Recipe recipe);

    Recipe editARecipe(Recipe recipe, String title, String description, String difficultyLevel, String allergyFactors);
}
