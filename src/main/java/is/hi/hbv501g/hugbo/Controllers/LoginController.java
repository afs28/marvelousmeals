package is.hi.hbv501g.hugbo.Controllers;


import is.hi.hbv501g.hugbo.Persistence.Entities.RecipeUser;
import is.hi.hbv501g.hugbo.Persistence.Repositories.RecipeUserRepository;
import is.hi.hbv501g.hugbo.Services.RecipeService;
import is.hi.hbv501g.hugbo.Services.RecipeUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @Autowired
    RecipeService recipeService;

    @Autowired
    private RecipeUserRepository recipeUserRepository;

    @Autowired
    RecipeUserService recipeUserService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginPage(HttpSession session, Model model) {
        System.out.println("login");
        displayLoginPage(session, model);
        return "login";
    }

    @PostMapping("/signup")
    public String AddUser (@RequestParam String recipeUsername, @RequestParam String recipePassword) {

        RecipeUser newUser = new RecipeUser(recipeUsername, recipePassword);
        newUser.setRecipeUserID(0l); // why can't this be skipped????
        recipeUserRepository.save(newUser);
        return "redirect:/";
    }

    private void displayLoginPage(HttpSession session, Model model) {
        System.out.println("display login page");
        if(!session.isNew()) {
            if(!(session.getAttribute("recipeuser") == null)) {
                model.addAttribute("recipeuser", session.getAttribute("recipeuser"));
                model.addAttribute("recipeUserLoggedIn", true);
            } else {
                model.addAttribute("recipeUserLoggedIn", false);
            }
        } else {
            model.addAttribute("recipeUserLoggedIn", false);
        }
    }

}
