package is.hi.hbv501g.hugbo.Persistence.Repositories;
import is.hi.hbv501g.hugbo.Persistence.Entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * The recipe user repository.
 * @Authors: AFS
 *
 */
public interface UserRepository extends CrudRepository<User, Integer> {
/*
                                            TO BE RECONFIGURED
 */
    Iterable<User> findAll();
    User findUserByUserId(Integer UserId);

    String addUser(String FirstName, String LastName);


}