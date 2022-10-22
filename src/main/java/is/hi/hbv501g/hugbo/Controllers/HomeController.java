package is.hi.hbv501g.hugbo.Controllers;

import is.hi.hbv501g.hugbo.Persistence.Entities.Recipe;
import is.hi.hbv501g.hugbo.Services.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;



@Controller
public class HomeController {

    final RecipeService recipeService;

    public HomeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping("/")
    public String createHome(Model model) {
        model.addAttribute("recipe", recipeService.findAll());
        return "index";
    }

    @GetMapping(value = "/create")
    public String create1(Model model) {
        model.addAttribute("recipe", new Recipe());
        return "formRecipe";
    }

    @PostMapping(value = "/create")
    public String create2(Model model, Recipe recipe) {
        model.addAttribute("recipe", recipeService.saveRecipe(recipe));
        return "redirect:/";
    }




}
