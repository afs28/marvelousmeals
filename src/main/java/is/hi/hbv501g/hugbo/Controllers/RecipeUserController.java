package is.hi.hbv501g.hugbo.Controllers;

import is.hi.hbv501g.hugbo.Persistence.Entities.RecipeUser;
import is.hi.hbv501g.hugbo.Services.RecipeUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@Controller
public class RecipeUserController {
    RecipeUserService recipeUserService;

    @Autowired
    public RecipeUserController(RecipeUserService recipeUserService){
        this.recipeUserService = recipeUserService;
    }

    @RequestMapping(value ="/signup", method = RequestMethod.GET)
    public String signupGET(RecipeUser recipeUser){
        return "signup";
    }
    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public String signupPOST(RecipeUser recipeUser, BindingResult result, Model model){
        if(result.hasErrors()){
            return "redirect:/signup";
        }
        RecipeUser exists = recipeUserService.findByRecipeUsername(recipeUser.getRecipeUsername());
        if(exists == null){
            RecipeUserService.save(recipeUser);
        }
        return "redirect:/";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginGET(RecipeUser recipeUser){
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String loginPOST(RecipeUser recipeUser, BindingResult result, Model model, HttpSession session){
        if(result.hasErrors()){
            return "login";
        }
        RecipeUser exists = RecipeUserService.login(recipeUser);
        if(exists != null){
            session.setAttribute("LoggedInUser", exists);
            model.addAttribute("LoggedInUser", exists);
            return "LoggedInUser";
        }
        return "redirect:/";
    }

    @RequestMapping(value = "/loggedin", method = RequestMethod.GET)
    public String loggedinGET(HttpSession session, Model model){
        RecipeUser sessionRecipeUser = (RecipeUser) session.getAttribute("LoggedInUser");
        if(sessionRecipeUser  != null){
            model.addAttribute("LoggedInUser", sessionRecipeUser);
            return "loggedInUser";
        }
        return "redirect:/";
    }
}
