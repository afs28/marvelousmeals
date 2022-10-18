package is.hi.hbv501g.hugbo.Controllers;

import is.hi.hbv501g.hugbo.Persistence.Entities.Recipe;
import is.hi.hbv501g.hugbo.Services.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import java.util.List;

@Controller
public class HomeController {
    private RecipeService recipeService;

    @Autowired
    public HomeController(RecipeService recipeService){
        this.recipeService = recipeService;
    }

    @RequestMapping("/")
    public String homePage(Model model){
        //Call a method in a Service Class
        List<Recipe> allRecipes = recipeService.findAll();
        //Add some data to the Model
        model.addAttribute("recipes", allRecipes);
        return "home";
    }

    @RequestMapping(value = "/addrecipe", method = RequestMethod.GET)
    public String addRecipeGET(Recipe recipe){

        return "newRecipe";
    }

    @RequestMapping(value = "/addrecipe", method = RequestMethod.POST)
    public String addRecipePOST(Recipe recipe, BindingResult result, Model model){
        if(result.hasErrors()){
            return "newRecipe";
        }
        RecipeService.save(recipe);
        return "redirect:/";
    }

    @RequestMapping(value="/delete/{id}", method = RequestMethod.GET)
    public String deleteRecipe(@PathVariable("id") long id, Model model){
        Recipe recipeToDelete = recipeService.findByID(id);
        recipeService.delete(recipeToDelete);
        return "redirect:/";
    }
}
