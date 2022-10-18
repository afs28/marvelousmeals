package is.hi.hbv501g.hugbo.Persistence.Entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * The main recipe user class, getters and setters.
 * @Authors: AFS
 */

@Entity
@Table(name="recipeUsers")
public class RecipeUser {

    /*
                                                    TO BE SPLIT UP IN TWO, RECIPE AND USER
    */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long recipeUserID;

    private String recipeUsername;
    private String recipeUserPassword;

    @OneToMany(mappedBy = "recipeuser", cascade = CascadeType.ALL, orphanRemoval = true)
    List<RecipeList> recipeList = new ArrayList<>();
    public RecipeUser() {

    }
    public RecipeUser(String recipeUsername, String recipeUserPassword){
        this.recipeUsername = recipeUsername;
        this.recipeUserPassword = recipeUserPassword;
    }

    public long getRecipeUserID() {
        return recipeUserID;
    }

    public void setRecipeUserID(long recipeUserID) {
        this.recipeUserID = recipeUserID;
    }

    public String getRecipeUsername() {
        return recipeUsername;
    }

    public void setRecipeUsername(String recipeUsername) {
        this.recipeUsername = recipeUsername;
    }

    public String getRecipeUserPassword() {
        return recipeUserPassword;
    }

    public void setRecipeUserPassword(String recipeUserPassword) {
        this.recipeUserPassword = recipeUserPassword;
    }

    public List<RecipeList> getRecipeList() {
        return recipeList;
    }

    public void setRecipeList(List<RecipeList> recipeList) {
        this.recipeList = recipeList;
    }
}
