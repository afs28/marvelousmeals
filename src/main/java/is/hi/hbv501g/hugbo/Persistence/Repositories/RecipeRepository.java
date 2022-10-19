package is.hi.hbv501g.hugbo.Persistence.Repositories;

import is.hi.hbv501g.hugbo.Persistence.Entities.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {

    Recipe save(Recipe recipe);
    void delete(Recipe recipe);
    List<Recipe> findAll();
    Recipe findByRecipeID(Long recipeID);

    //Recipe findByTitle();

    //List<Recipe> findByTitle(String title);

}
