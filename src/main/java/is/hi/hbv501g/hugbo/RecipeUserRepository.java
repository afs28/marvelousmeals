package is.hi.hbv501g.hugbo;

import org.springframework.data.repository.CrudRepository;

public interface RecipeUserRepository extends CrudRepository<RecipeUser, Integer> {

    RecipeUser findRecipeUserByUid(Integer uid);
}