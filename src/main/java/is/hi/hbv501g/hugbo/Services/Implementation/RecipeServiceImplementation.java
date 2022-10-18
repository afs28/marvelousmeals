package is.hi.hbv501g.hugbo.Services.Implementation;

import is.hi.hbv501g.hugbo.Persistence.Entities.Recipe;
import is.hi.hbv501g.hugbo.Persistence.Repositories.RecipeRepository;
import is.hi.hbv501g.hugbo.Services.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeServiceImplementation implements RecipeService {
    private RecipeRepository recipeRepository;

    @Autowired
    public RecipeServiceImplementation(RecipeRepository recipeRepository){
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Recipe findByTitle(String title){
        return recipeRepository.findByTitle(title).get(0);
    }

    @Override
    public List<Recipe> findAll(){
        return recipeRepository.findAll();
    }

    @Override
    public Recipe findByID(long recipeID){
        return recipeRepository.findByID(recipeID);
    }

    @Override
    public Recipe save(Recipe recipe) {
        return recipeRepository.save(recipe);
    }

    @Override
    public void delete(Recipe recipe){
        recipeRepository.delete(recipe);
    }
}
