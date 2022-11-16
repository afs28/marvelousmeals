package is.hi.hbv501g.hugbo.Services;

import is.hi.hbv501g.hugbo.Persistence.Entities.RecipeComments;
import is.hi.hbv501g.hugbo.Persistence.Entities.RecipeRatings;

public interface RatingService {

    RecipeRatings findByRatingID(long ratingID);
    RecipeRatings[] findByRecipeID(long recipeID);
    RecipeRatings saveRating(RecipeRatings newRating);
    void delete(RecipeRatings recipeRatings);
}
