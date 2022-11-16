package is.hi.hbv501g.hugbo.Services.Implementation;

import is.hi.hbv501g.hugbo.Persistence.Entities.RecipeComments;
import is.hi.hbv501g.hugbo.Persistence.Entities.RecipeUser;
import is.hi.hbv501g.hugbo.Persistence.Repositories.CommentRepository;
import is.hi.hbv501g.hugbo.Persistence.Repositories.RecipeRepository;
import is.hi.hbv501g.hugbo.Persistence.Repositories.RecipeUserRepository;
import is.hi.hbv501g.hugbo.Services.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImplementation implements CommentService {
    @Autowired
    CommentRepository commentRepository;
    @Autowired
    RecipeRepository recipeRepository;
    @Autowired
    RecipeUserRepository recipeUserRepository;

    @Override
    public RecipeComments findByCommentID(long commentID) {
        return commentRepository.findByCommentID(commentID);
    }
    @Override
    public RecipeComments[] findByRecipeID(long recipeID) { return commentRepository.findByRecipeID(recipeID);
    }
    @Override
    public RecipeComments saveComment(RecipeComments newComment) {
        return commentRepository.save(newComment);
    }
    @Override
    public void delete(RecipeComments recipeComments){
        commentRepository.delete(recipeComments);
    }
}
