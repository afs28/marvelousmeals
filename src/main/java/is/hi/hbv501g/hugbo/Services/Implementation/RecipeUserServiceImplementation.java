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
    public void changePassword(RecipeUser recipeUser, String newPassword) {
        recipeUser.setRecipeUserPassword(newPassword);
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
        RecipeUser doesExists = findByRecipeUsername(recipeUser.getRecipeUsername());
        if(doesExists != null) {
            if(doesExists.getRecipeUserPassword().equals(recipeUser.getRecipeUserPassword()));
                return doesExists;
        }
        return null;
    }

    @Override
    public RecipeUser findByRecipeUserID(long id) {
        return recipeUserRepository.findByRecipeUserID(id);
    }
}
