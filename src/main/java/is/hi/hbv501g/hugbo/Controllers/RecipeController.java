package is.hi.hbv501g.hugbo.Controllers;

import is.hi.hbv501g.hugbo.Persistence.Entities.RecipeUser;
import is.hi.hbv501g.hugbo.Persistence.Repositories.RecipeRepository;
import is.hi.hbv501g.hugbo.Persistence.Repositories.RecipeUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * The main controller that handles recipes and users.
 * @Authors: AFS
 *
 */


@RestController
public class RecipeController {
/*
                                                  TO BE CORRECTED
 */


    @Autowired
    private RecipeUserRepository recipeUserRepository;

    private RecipeRepository recipeRepository;


    /**
     * Asks for first and last name, then adds user to repository.
     * @param first first name
     * @param last last name
     * @return Returns a string of the user's name.
     */

    @PostMapping("/add")
    public String addUser(@RequestParam String first, @RequestParam String last) {
        RecipeUser recipeUser = new RecipeUser();
        recipeUser.setFirstName(first);
        recipeUser.setLastName(last);
        recipeUserRepository.save(recipeUser);
        return "Added new user to repo!";
    }

    /**
     * Fetches all the users in the database.
     * @return Returns a list of all the users.
     */

    @GetMapping("/list")
    public Iterable<RecipeUser> getUsers() {
        return recipeUserRepository.findAll();
    }

    /**
     * Fetches requested user by their ID.
     * @param id Possible master key?
     * @return Returns user by ID.
     */
    @GetMapping("/find/{id}")
    public RecipeUser findUserById(@PathVariable Integer id) {
        return recipeUserRepository.findUserByRecipeUserId(id);
    }

}
