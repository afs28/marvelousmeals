package is.hi.hbv501g.hugbo.Controllers;


import is.hi.hbv501g.hugbo.Persistence.Entities.Recipe;
import is.hi.hbv501g.hugbo.Services.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * The main controller that handles recipes and users.
 * @Authors: AFS
 *
 */

@Controller
public class RecipeController {

    @Autowired
    private RecipeService recipeService;

    @RequestMapping(value = "/recipe", method = RequestMethod.GET)
    @ResponseBody
    public Model displayRecipe(Model model, @RequestParam String id) {
        Recipe rep = recipeService.findByID(Long.parseLong(id));
        model.addAttribute("recipe", rep);
        return model;
    }



}
