package is.hi.hbv501g.hugbo.Controllers;

import is.hi.hbv501g.hugbo.Persistence.Entities.Recipe;
import is.hi.hbv501g.hugbo.Persistence.Entities.RecipeUser;
import is.hi.hbv501g.hugbo.Services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import is.hi.hbv501g.hugbo.Controllers.RecipeController;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


@Controller
public class HomeController {

    final RecipeService recipeService;

    public HomeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    private boolean isLoggedIn(HttpSession session, Model model) {
        RecipeUser sessionUser = (RecipeUser) session.getAttribute("LoggedInUser");
        if(sessionUser  != null){
            model.addAttribute("LoggedInUser", sessionUser);
            return true;
        }
        return false;
    }
    @GetMapping("/")
    public String createHome(Model model) {
        model.addAttribute("recipe", recipeService.findAll());
        System.out.println("create home - index page called");
        return "index";
    }

    @GetMapping(value = "/create")
    public String createRecipe(Model model, HttpSession session) {
        if (isLoggedIn(session, model)) {
            model.addAttribute("recipe", new Recipe());
            System.out.println("create - form recipe called");
            return "formRecipe";
        }
        return "redirect:/login";
    }

    @PostMapping(value = "/create")
    public String saveRecipe(Model model, Recipe recipe) {
        model.addAttribute("recipe", recipeService.saveRecipe(recipe));
        System.out.println("save - redirect:/ called");
        return "redirect:/";
    }

    @RequestMapping(value="edit-recipe", method = RequestMethod.GET)
    public String displayEditARecipe(HttpSession session, Model model) {
        if (isLoggedIn(session, model)) {
            return "editFormRecipe";
        }
        return "redirect:/login";
    }

    @RequestMapping(value="edit-recipe", method = RequestMethod.POST)
    public String editARecipe(HttpSession session, Model model, HttpServletRequest request) {
        String title = request.getParameter("title");
        String description = request.getParameter("description");
        String difficultyLevel = request.getParameter("difficultyLevel");
        String allergyFactors = request.getParameter("allergyFactors");
        Recipe recipe = recipeService.editARecipe((Recipe)session.getAttribute("recipe"),title,
                description, difficultyLevel, allergyFactors);
        System.out.println("editARecipe called");
        recipeService.saveRecipe(recipe);

        return "redirect:/";
    }

}
