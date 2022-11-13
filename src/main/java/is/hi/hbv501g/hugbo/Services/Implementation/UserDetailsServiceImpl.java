package is.hi.hbv501g.hugbo.Services.Implementation;
// https://stackoverflow.com/questions/48371540/spring-security-the-dependencies-of-some-of-the-beans-in-the-application-contex
/*
import is.hi.hbv501g.hugbo.Persistence.Entities.RecipeUser;
import is.hi.hbv501g.hugbo.Persistence.Repositories.RecipeUserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {

    private RecipeUserRepository recipeUserRepository;
    @Override
    public UserDetails loadUserByUsername(final String username) {

        RecipeUser user = recipeUserRepository.findByRecipeUsername(username);

        return buildUserForAuthentication(user);
    }

    private org.springframework.security.core.userdetails.User buildUserForAuthentication(RecipeUser user) {

        List<GrantedAuthority> authorities = new ArrayList<>();
        return new org.springframework.security.core.userdetails.User(
                user.getRecipeUsername(),
                user.getRecipeUserPassword(),
                true,
                true,
                true,
                true,
                authorities);
    }
}
 */
