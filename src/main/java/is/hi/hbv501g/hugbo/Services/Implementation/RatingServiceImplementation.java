package is.hi.hbv501g.hugbo.Services.Implementation;

import is.hi.hbv501g.hugbo.Persistence.Entities.RecipeComments;
import is.hi.hbv501g.hugbo.Persistence.Entities.RecipeRatings;
import is.hi.hbv501g.hugbo.Persistence.Repositories.CommentRepository;
import is.hi.hbv501g.hugbo.Persistence.Repositories.RatingRepository;
import is.hi.hbv501g.hugbo.Persistence.Repositories.RecipeRepository;
import is.hi.hbv501g.hugbo.Persistence.Repositories.RecipeUserRepository;
import is.hi.hbv501g.hugbo.Services.CommentService;
import is.hi.hbv501g.hugbo.Services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RatingServiceImplementation implements RatingService {
    @Autowired
    RatingRepository ratingRepository;
    @Autowired
    CommentRepository commentRepository;
    @Autowired
    RecipeRepository recipeRepository;
    @Autowired
    RecipeUserRepository recipeUserRepository;

    @Override
    public RecipeRatings findByRatingID(long ratingID) {
        return ratingRepository.findByRatingID(ratingID);
    }
    @Override
    public RecipeRatings[] findByRecipeID(long recipeID) { return ratingRepository.findByRecipeID(recipeID);
    }
    @Override
    public RecipeRatings saveRating(RecipeRatings newRating) {
        return ratingRepository.save(newRating);
    }
    @Override
    public void delete(RecipeRatings recipeRatings){
        ratingRepository.delete(recipeRatings);
    }
}
