package is.hi.hbv501g.hugbo.Persistence.Repositories;

import is.hi.hbv501g.hugbo.Persistence.Entities.RecipeComments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<RecipeComments, Long> {

    RecipeComments findByCommentID(long commentID);
    RecipeComments[] findByRecipeID(long recipeID);
    RecipeComments save(RecipeComments recipeComments);
    void delete(RecipeComments recipeComments);

}
