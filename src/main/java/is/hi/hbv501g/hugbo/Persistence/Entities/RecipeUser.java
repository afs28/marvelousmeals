package is.hi.hbv501g.hugbo.Persistence.Entities;

import javax.persistence.*;

/**
 * The main recipe user class, getters and setters.
 * @Authors: AFS
 */
@Entity
public class RecipeUser {

    /*
       We have to split recipes and users up, they are their own entities
    */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Integer recipeUserId;

    private String firstName;
    private String lastName;

    public Integer getUId() {
        return recipeUserId;
    }

    public void setUId(Integer id) {
        this.recipeUserId = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
