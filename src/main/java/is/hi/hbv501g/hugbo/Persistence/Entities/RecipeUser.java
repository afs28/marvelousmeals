package is.hi.hbv501g.hugbo.Persistence.Entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * The main recipe user class, getters and setters.
 * @Authors: AFS
 */

@Entity
//@Table(name="recipeusers")
@Embeddable
public class RecipeUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long recipeUserID;

    private String recipeUsername;
    private String recipeUserPassword;

    public RecipeUser() {

    }
    public RecipeUser(String recipeUsername, String recipeUserPassword){
        this.recipeUsername = recipeUsername;
        this.recipeUserPassword = recipeUserPassword;
    }

    public long getRecipeUserID() {
        return recipeUserID;
    }

    public void setRecipeUserID(Long recipeUserID) {
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

}
