package is.hi.hbv501g.hugbo.Services;

import is.hi.hbv501g.hugbo.Persistence.Entities.RecipeComments;

public interface CommentService {
    RecipeComments findByCommentID(long commentID);
    RecipeComments[] findByRecipeID(long recipeID);
    RecipeComments saveComment(RecipeComments newComment);
    void delete(RecipeComments recipeComments);

}
