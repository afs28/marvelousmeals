package is.hi.hbv501g.hugbo.Services.Implementation;

import is.hi.hbv501g.hugbo.Persistence.Entities.RecipeUser;
import is.hi.hbv501g.hugbo.Persistence.Repositories.RecipeUserRepository;
import is.hi.hbv501g.hugbo.Services.RecipeUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeUserServiceImplementation implements RecipeUserService {
    private RecipeUserRepository recipeUserRepository;

    @Autowired
    public RecipeUserServiceImplementation(RecipeUserRepository recipeUserRepository){
        this.recipeUserRepository = recipeUserRepository;
    }

    @Override
    public RecipeUser save(RecipeUser recipeUser){
        return recipeUserRepository.save(recipeUser);
    }
    @Override
    public void delete(RecipeUser recipeUser){
        recipeUserRepository.delete(recipeUser);
    }

    @Override
    public List<RecipeUser> findAll(){
        return recipeUserRepository.findAll();
    }


    @Override
    public RecipeUser findByRecipeUsername(String recipeUsername){
        return recipeUserRepository.findByRecipeUsername(recipeUsername);
    }

    @Override
    public RecipeUser login(RecipeUser recipeUser){
        RecipeUser doesExist = findByRecipeUsername(recipeUser.getRecipeUsername());
        if(doesExist != null){
            if(doesExist.getRecipeUserPassword().equals(recipeUser.getRecipeUserPassword())){
                return doesExist;
            }
        }
        return null;
    }

    @Override
    public RecipeUser findByRecipeUserID(Long id) {
        return recipeUserRepository.findByRecipeUserID(id);
    }
}
