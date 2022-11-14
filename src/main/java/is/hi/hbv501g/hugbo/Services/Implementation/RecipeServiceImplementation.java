package is.hi.hbv501g.hugbo.Services.Implementation;

import is.hi.hbv501g.hugbo.Persistence.Entities.Recipe;
import is.hi.hbv501g.hugbo.Persistence.Repositories.RecipeRepository;
import is.hi.hbv501g.hugbo.Persistence.Repositories.RecipeUserRepository;
import is.hi.hbv501g.hugbo.Services.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Service
public class RecipeServiceImplementation implements RecipeService {
    @Autowired
    RecipeRepository recipeRepository;

    @Autowired
    RecipeUserRepository recipeUserRepository;


    @Override
    public List<Recipe> findAll(){
        return recipeRepository.findAll();
    }

    @Override
    public List<Recipe> findByTitle(String title) {
        return recipeRepository.findByTitle(title);
    }


    @Override
    public Recipe findByID(Long recipeID){
        return recipeRepository.findByRecipeID(recipeID);
    }

    @Override
    public Recipe saveRecipe(Recipe recipe) {
        return recipeRepository.save(recipe);
    }

    @Override
    public void delete(Recipe recipe){
        recipeRepository.delete(recipe);
    }

    @Override
    public Recipe editARecipe(Recipe recipe, String title, String description, String difficultyLevel, String allergyFactors) {
        recipe.setTitle(title);
        recipe.setDescription(description);
        recipe.setDifficultyLevel(difficultyLevel);
        recipe.setAllergyFactors(allergyFactors);
        return recipeRepository.save(recipe);
    }
}
