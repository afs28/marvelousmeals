package is.hi.hbv501g.hugbo.Controllers;


import is.hi.hbv501g.hugbo.Services.RecipeService;
import is.hi.hbv501g.hugbo.Services.RecipeUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @Autowired
    RecipeService recipeService;
    @Autowired
    RecipeUserService recipeUserService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginPage(HttpSession session, Model model) {
        System.out.println("login");
        displayLoginPage(session, model);
        return "login";
    }

    @RequestMapping(value = "/signup", method = RequestMethod.GET)
    public String signUpPage(HttpSession session, Model model) {
        System.out.println("signup");
        displaySignUpPage(session, model);
        return "signup";
    }

    private void displaySignUpPage(HttpSession session, Model model) {
        System.out.println("display signup page");
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
