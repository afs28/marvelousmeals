package is.hi.hbv501g.hugbo.Services;

import is.hi.hbv501g.hugbo.Persistence.Entities.RecipeUser;

import java.util.List;

public interface RecipeUserService {
    RecipeUser save(RecipeUser recipeUser);
    void delete(RecipeUser recipeUser);
    List<RecipeUser> findAll();
    // find user by username
    RecipeUser findByRecipeUserByUsername(String recipeUsername);
    RecipeUser login(RecipeUser recipeUser);
}
