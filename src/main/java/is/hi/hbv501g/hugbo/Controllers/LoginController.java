package is.hi.hbv501g.hugbo.Controllers;

import is.hi.hbv501g.hugbo.Persistence.Entities.RecipeUser;
import is.hi.hbv501g.hugbo.Persistence.Repositories.RecipeUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
    /*
           https://www.djamware.com/post/5e32d450ad84a94e7885bbf9/spring-boot-tutorial-create-java-login-web-app-using-spring-security-and-eclipse
     */
    @Autowired
    private RecipeUserRepository myRepo;

    @RequestMapping(value="/welcome")
    public static String welcome() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login");
        //return modelAndView;
        return "login";
    }

    @RequestMapping(value = "/signup", method = RequestMethod.GET)
    public String login() {
        return "attempting to login";
    }


    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public String createNewUser(RecipeUser user, BindingResult bindingResult) {
        /*
        ModelAndView modelAndView = new ModelAndView();
        RecipeUser userExists = myRepo.findByRecipeUsername(user.getRecipeUsername());
        if (userExists != null) {
            bindingResult
                    .rejectValue("email", "error.user",
                            "There is already a user registered with the username provided");
        }
        if (bindingResult.hasErrors()) {
            modelAndView.setViewName("signup");
        } else {
            myRepo.save(user);
            modelAndView.addObject("successMessage", "User has been registered successfully");
            modelAndView.addObject("user", new RecipeUser());
            modelAndView.setViewName("login");

        }

         */
        return "attempted to create new user";
    }

}
