package is.hi.hbv501g.hugbo.Persistence.Entities;

import javax.persistence.*;

@Entity
@Table(name = "recipelist")
public class RecipeList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long recipeUserID;

    @ManyToOne(fetch = FetchType.LAZY)
    private RecipeUser recipeUser;

    @ManyToOne(fetch = FetchType.LAZY)
    private Recipe recipe;

    @ManyToOne(fetch = FetchType.LAZY)
    private RecipeComments recipeComments;

    @ManyToOne(fetch = FetchType.LAZY)
    private RecipeRatings recipeRatings;

    public RecipeList() {
    }

    public RecipeList(RecipeUser recipeUser, Recipe recipe) {
        this.recipeUser = recipeUser;
        this.recipe = recipe;
    }

    public long getRecipeUserID() {
        return recipeUserID;
    }

    public void setRecipeUserID(long recipeUserID) {
        this.recipeUserID = recipeUserID;
    }

    public RecipeUser getRecipeUser() {
        return recipeUser;
    }

    public void setRecipeUser(RecipeUser recipeUser) {
        this.recipeUser = recipeUser;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public RecipeComments getRecipeComments() {
        return recipeComments;
    }

    public void setRecipeComments(RecipeComments recipeComments) {
        this.recipeComments = recipeComments;
    }

    public RecipeRatings getRecipeRatings() {
        return recipeRatings;
    }

    public void setRecipeRatings(RecipeRatings recipeRatings) {
        this.recipeRatings = recipeRatings;
    }
}
