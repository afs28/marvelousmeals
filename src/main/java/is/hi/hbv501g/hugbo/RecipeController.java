package is.hi.hbv501g.hugbo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class RecipeController {

    @Autowired
    private RecipeUserRepository recipeUserRepository;


    @PostMapping("/add")
    public String addUser(@RequestParam String first, @RequestParam String last) {
        RecipeUser recipeUser = new RecipeUser();
        recipeUser.setFirstName(first);
        recipeUser.setLastName(last);
        recipeUserRepository.save(recipeUser);
        return "Added new user to repo!";
    }

    @GetMapping("/list")
    public Iterable<RecipeUser> getUsers() {
        return recipeUserRepository.findAll();
    }

    @GetMapping("/find/{id}")
    public RecipeUser findUserById(@PathVariable Integer id) {
        return recipeUserRepository.findRecipeUserByUid(id);
    }

}
