package is.hi.hbv501g.hugbo.Controllers;


import is.hi.hbv501g.hugbo.Persistence.Entities.Recipe;
import is.hi.hbv501g.hugbo.Persistence.Entities.RecipeComments;
import is.hi.hbv501g.hugbo.Persistence.Entities.RecipeUser;
import is.hi.hbv501g.hugbo.Persistence.Repositories.CommentRepository;
import is.hi.hbv501g.hugbo.Services.CommentService;
import is.hi.hbv501g.hugbo.Services.RecipeService;
import org.apache.catalina.Store;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * The main controller that handles recipes and users.
 * @Authors: AFS
 *
 */

@Controller
public class RecipeController {

    @Autowired
    private RecipeService recipeService;
    @Autowired
    private CommentService commentService;
    @Autowired
    private CommentRepository commentRepository;

    @RequestMapping(value = "/recipe", method = RequestMethod.GET)
    @ResponseBody
    public Model create2(Model model, @RequestParam String id) {
        Recipe rep = recipeService.findByID(Long.parseLong(id));
        model.addAttribute("recipe", rep);
        return model;
    }

    @PostMapping("/submit")
    public String AddComment (Model model, @RequestParam String recipeUsername, @RequestParam String recipeComment) {
        RecipeUser recipeUser = (RecipeUser) model.getAttribute("recipe");
        RecipeComments newComment = new RecipeComments();
        newComment.setCommentID(0l); // why can't this be skipped????
        newComment.setRecipeComment(recipeComment);
        newComment.setNickname(recipeUsername);
        newComment.setRecipeID(recipeUser.getRecipeUserID());
        commentRepository.save(newComment);
        return "redirect:/recipes?id=" + String.valueOf(recipeUser.getRecipeUserID());
    }
}
