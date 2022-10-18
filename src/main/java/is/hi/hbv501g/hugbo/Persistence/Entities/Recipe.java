package is.hi.hbv501g.hugbo.Persistence.Entities;

import javax.persistence.*;
import javax.swing.*;

@Entity
@Table(name = "recipe")
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private String title;
    private String author;
    private String description;
    private String difficultyLevel;
    private String allergyFactors;
    private String comment;
    private Double rating;
    private ImageIcon imageOfRecipe;
    private Integer forNumberOfPeople;
    private Integer prepTime;
    private Integer recipeUserId;

    public Integer getUId() {
        return recipeUserId;
    }

    public void setUId(Integer id) {
        this.recipeUserId = id;
    }

    public String getTitle() {
        return title;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(String difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    public String getAllergyFactors() {
        return allergyFactors;
    }

    public void setAllergyFactors(String allergyFactors) {
        this.allergyFactors = allergyFactors;
    }

    public ImageIcon getImageOfRecipe() {
        return imageOfRecipe;
    }

    public void setImageOfRecipe(ImageIcon imageOfRecipe) {
        this.imageOfRecipe = imageOfRecipe;
    }

    public Integer getForNumberOfPeople() {
        return forNumberOfPeople;
    }

    public void setForNumberOfPeople(Integer forNumberOfPeople) {
        this.forNumberOfPeople = forNumberOfPeople;
    }

    public Integer getPrepTime() {
        return prepTime;
    }

    public void setPrepTime(Integer prepTime) {
        this.prepTime = prepTime;
    }
}
