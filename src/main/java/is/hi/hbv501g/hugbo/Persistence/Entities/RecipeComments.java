package is.hi.hbv501g.hugbo.Persistence.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RecipeComments {
    private Long commentsID;

    public void setCommentsID(Long commentsID) {
        this.commentsID = commentsID;
    }

    @Id
    public Long getCommentsID() {
        return commentsID;
    }
}
