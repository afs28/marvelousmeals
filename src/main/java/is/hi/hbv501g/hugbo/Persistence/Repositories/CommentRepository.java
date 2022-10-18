package is.hi.hbv501g.hugbo.Persistence.Repositories;

import is.hi.hbv501g.hugbo.Persistence.Entities.Comments;
import org.springframework.data.repository.CrudRepository;

public interface CommentRepository extends CrudRepository<Comments, Long> {
}
