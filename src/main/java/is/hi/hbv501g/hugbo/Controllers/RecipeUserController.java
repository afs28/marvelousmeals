package is.hi.hbv501g.hugbo.Controllers;

import is.hi.hbv501g.hugbo.Persistence.Entities.RecipeUser;
import is.hi.hbv501g.hugbo.Persistence.Repositories.RecipeUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class RecipeUserController {

    @Autowired
    private RecipeUserRepository myRepo;

    private boolean isLoggedIn(HttpSession session, Model model) {
        RecipeUser sessionUser = (RecipeUser) session.getAttribute("LoggedInUser");
        if(sessionUser  != null){
            model.addAttribute("LoggedInUser", sessionUser);
            return true;
        }
        return false;
    }

    @RequestMapping(value="/list")
    public Iterable<RecipeUser> getUsers(HttpSession session, Model model) {
        if (isLoggedIn(session, model)) {
            return myRepo.findAll();
        }
        return null;
    }

}
