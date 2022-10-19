package is.hi.hbv501g.hugbo.Controllers;

import is.hi.hbv501g.hugbo.Persistence.Entities.RecipeUser;
import is.hi.hbv501g.hugbo.Persistence.Repositories.RecipeUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecipeUserController {

    @Autowired
    private RecipeUserRepository myRepo;
    @PostMapping("/add")
    public String AddUser (@RequestParam String username, @RequestParam String password) {

        RecipeUser newUser = new RecipeUser(username, password);
        newUser.setRecipeUserID(0l); // why can't this be skipped????
        myRepo.save(newUser);
        return "user added to the repo!";
    }

    @GetMapping("/list")
    public Iterable<RecipeUser> getUsers() {
        return myRepo.findAll();
    }

}
