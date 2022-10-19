package is.hi.hbv501g.hugbo.Persistence.Repositories;

import is.hi.hbv501g.hugbo.Persistence.Entities.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {



    Recipe save(Recipe recipe);
    void delete(Recipe recipe);
    List<Recipe> findAll();
    Recipe findByID(long id);
    List<Recipe> findByTitle(String title);
    List<Recipe> findByAuthor(String author);

    // more to come
}
