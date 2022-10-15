package is.hi.hbv501g.hugbo.Persistence.Entities;

import javax.persistence.*;

/**
 * The main recipe user class, getters and setters.
 * @Authors: AFS
 */
@Entity
public class User {

    /*
                                                    TO BE SPLIT UP IN TWO, RECIPE AND USER
    */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Integer userId;

    private String firstName;
    private String lastName;

    public Integer getUId() {
        return userId;
    }

    public void setUId(Integer id) {
        this.userId = id;
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
