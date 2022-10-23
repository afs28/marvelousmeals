package is.hi.hbv501g.hugbo;

import is.hi.hbv501g.hugbo.Persistence.Repositories.CommentRepository;
import is.hi.hbv501g.hugbo.Persistence.Repositories.RatingRepository;
import is.hi.hbv501g.hugbo.Persistence.Repositories.RecipeRepository;
import is.hi.hbv501g.hugbo.Persistence.Repositories.RecipeUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * Launches the application.
 * @Authors: AFS
 *
 * In order to watch the application in action go to https://localhost:8080
 * Minor functionality has been added, you can add users to the repo but that's about it... so far!
 *
 */
    // server pw: 9292
    // this is team member Birgitta Ýr Eyþórsdóttir (bye1@hi.is)
    // this is team member Heba Sólveig Heimisdóttir (hsh58@hi.is)
    // this is team member Hrefna Karen Valgarðsdóttir (hkv5@hi.is)
    // branch testnation
@SpringBootApplication
public class HugboApplication implements CommandLineRunner {

    @Autowired
    private RecipeRepository recipeRepository;

    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    private RatingRepository ratingRepository;

    @Autowired
    private RecipeUserRepository recipeUserRepository;
    public static void main(String[] args) {

        SpringApplication.run(HugboApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }

}
