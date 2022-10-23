package is.hi.hbv501g.hugbo.Persistence.Entities;

import com.sun.istack.NotNull;

import javax.persistence.*;

/**
 * The main recipe user class, getters and setters.
 * @Authors: AFS
 */

@Entity
@Table(name="recipeuser")
public class RecipeUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long recipeUserID;
    @NotNull
    private String recipeUsername;
    @NotNull
    private String recipeUserPassword;

    public RecipeUser() {
        super();
        // TODO Auto-generated constructor stub
    }
    public RecipeUser(String recipeUsername, String recipeUserPassword){
        super();
        this.recipeUsername = recipeUsername;
        this.recipeUserPassword = recipeUserPassword;
    }

    public RecipeUser(long recipeUserID){
        this.recipeUserID = recipeUserID;
    }

    public long getRecipeUserID() {
        return recipeUserID;
    }

    public void setRecipeUserID(long recipeUserID) {
        this.recipeUserID = recipeUserID;
    }
    @Column(name = "recipeusername", unique = true)
    public String getRecipeUsername() {
        return recipeUsername;
    }

    public void setRecipeUsername(String recipeUsername) {
        this.recipeUsername = recipeUsername;
    }
    @Column(name = "recipeuserpassword")
    public String getRecipeUserPassword() {
        return recipeUserPassword;
    }

    public void setRecipeUserPassword(String recipeUserPassword) {
        this.recipeUserPassword = recipeUserPassword;
    }

}
