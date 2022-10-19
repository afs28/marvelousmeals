package is.hi.hbv501g.hugbo.Services;

import is.hi.hbv501g.hugbo.Persistence.Entities.Recipe;

import java.util.List;

public interface RecipeService {
    Recipe findByTitle(String title);
    List<Recipe> findAll();
    Recipe findByID(long recipeID);
    Recipe save(Recipe recipe);
    void delete(Recipe recipe);
}
