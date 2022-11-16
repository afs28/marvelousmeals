package is.hi.hbv501g.hugbo.Persistence.Entities;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name="reciperating")
public class RecipeRatings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ratingid")
    private Long ratingID;

    @Column(name = "myrating")
    private Double myRating;

    @Column(name = "nickname")
    private String nickname;

    @NotNull
    @Column(name = "recipeid")
    private Long recipeID;

    public void setRatingsID(Long ratingsID) {
        this.ratingID = ratingsID;
    }

    public Long getRatingsID() {
        return ratingID;
    }

    public void setRecipeRating(Double recipeRating) {
        this.myRating = recipeRating;
    }
    public Double getRecipeRating() {
        return myRating;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }
    public void setRecipeID(Long recipeID){
        this.recipeID = recipeID;
    }
    public Long getRecipeID() {
        return recipeID;
    }
}