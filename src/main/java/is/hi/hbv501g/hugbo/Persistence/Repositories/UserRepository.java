package is.hi.hbv501g.hugbo.Persistence.Repositories;
import is.hi.hbv501g.hugbo.Persistence.Entities.User;
import org.springframework.data.repository.CrudRepository;

/**
 * The recipe user repository.
 * @Authors: AFS
 *
 */
public interface UserRepository extends CrudRepository<User, Integer> {
/*
                                            TO BE RECONFIGURED
 */
    User findUserByUserId(Integer UserId);
}