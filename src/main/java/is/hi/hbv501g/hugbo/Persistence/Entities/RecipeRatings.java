package is.hi.hbv501g.hugbo.Persistence.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RecipeRatings {
    private Long ratingsID;

    public void setRatingsID(Long ratingsID) {
        this.ratingsID = ratingsID;
    }

    @Id
    public Long getRatingsID() {
        return ratingsID;
    }
}
