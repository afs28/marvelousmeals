package is.hi.hbv501g.hugbo.Persistence.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Comments {
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
