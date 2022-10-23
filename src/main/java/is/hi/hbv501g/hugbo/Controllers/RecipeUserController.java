package is.hi.hbv501g.hugbo.Controllers;

import is.hi.hbv501g.hugbo.Persistence.Entities.RecipeUser;
import is.hi.hbv501g.hugbo.Persistence.Repositories.RecipeUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecipeUserController {

    @Autowired
    private RecipeUserRepository myRepo;

    @RequestMapping(value="/list")
    public Iterable<RecipeUser> getUsers() {
        return myRepo.findAll();
    }

}
