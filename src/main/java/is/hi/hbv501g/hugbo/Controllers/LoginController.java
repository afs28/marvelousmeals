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

    /*
        Notkun: s/loginPage
        Fyrir:  s er síðan sem að verkefnið er á.
                Það er notað GET skipun (á loginPage)
        Eftir:  skilar login/signup síðuni
     */
    @RequestMapping(value = "/loginPage", method = RequestMethod.GET)
    public String loginPage(HttpSession session, Model model) {
        //System.out.println("login");
        //displayLoginPage(session, model);
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password) {
        System.out.println("login");
        //displayLoginPage(session, model);
    /*
        UsernamePasswordAuthenticationToken authRequest = new UsernamePasswordAuthenticationToken(username, password);

        // Authenticate the user
        Authentication authentication = authenticationManager.authenticate(authRequest);
        SecurityContext securityContext = SecurityContextHolder.getContext();
        securityContext.setAuthentication(authentication);

        // Create a new session and add the security context.
        HttpSession session = request.getSession(true);
        session.setAttribute("SPRING_SECURITY_CONTEXT", securityContext);
        */
        return "redirect:/";
    }

    @PostMapping("/signup")
    public String AddUser (@RequestParam String recipeUsername, @RequestParam String recipePassword) {

        RecipeUser newUser = new RecipeUser(recipeUsername, recipePassword);
        recipeUserRepository.save(newUser);
        return "redirect:/";
    }
/*
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
*/
}
