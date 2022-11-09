package is.hi.hbv501g.hugbo.Services;

import is.hi.hbv501g.hugbo.Persistence.Entities.Recipe;
import is.hi.hbv501g.hugbo.Persistence.Entities.RecipeComments;

public interface CommentService {
    RecipeComments saveComment(RecipeComments newComment);
    void delete(RecipeComments recipeComments);

}
