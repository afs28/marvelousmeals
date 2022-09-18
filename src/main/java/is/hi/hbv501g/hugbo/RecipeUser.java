package is.hi.hbv501g.hugbo;

import javax.persistence.*;

@Entity
public class RecipeUser {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer uid;

    private String firstName;
    private String lastName;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer id) {
        this.uid = id;
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
