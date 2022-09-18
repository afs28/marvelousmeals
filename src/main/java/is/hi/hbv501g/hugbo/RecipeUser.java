package is.hi.hbv501g.hugbo;

import javax.persistence.*;

/**
 * The main recipe user class, getters and setters.
 * @Authors: AFS
 */
@Entity
public class RecipeUser {

    // Do we add recipes in here as well or should we keep things separate?
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
