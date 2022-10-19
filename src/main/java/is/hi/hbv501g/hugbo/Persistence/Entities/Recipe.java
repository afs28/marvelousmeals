package is.hi.hbv501g.hugbo.Persistence.Entities;

import javax.persistence.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "recipe")
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long recipeID;

    private String title;
    private String description;
    private String difficultyLevel;
    private String allergyFactors;
    private String comments;
    private Double ratings;
    private ImageIcon imageOfRecipe;
    private Integer forNumberOfPeople;
    private Integer prepTime;

    @OneToMany(mappedBy = "recipe", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<RecipeList> recipeList = new ArrayList<>();

    public Recipe(){
    }

    public Recipe(String title, String description, String difficultyLevel,
                  String allergyFactors, String comments, Double ratings,
                  ImageIcon imageOfRecipe, Integer forNumberOfPeople, Integer prepTime) {

        this.title = title;
        this.description = description;
        this.difficultyLevel = difficultyLevel;
        this.allergyFactors = allergyFactors;
        this.comments = comments;
        this.ratings = ratings;
        this.imageOfRecipe = imageOfRecipe;
        this.forNumberOfPeople = forNumberOfPeople;
        this.prepTime = prepTime;
    }

    public long getRecipeID() {
        return recipeID;
    }

    public void setRecipeID(long recipeID) {
        this.recipeID = recipeID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public String getComments() {
        return comments;
    }

    public void setComments(String comment) {
        this.comments = comment;
    }

    public Double getRatings() {
        return ratings;
    }

    public void setRatings(Double rating) {
        this.ratings = rating;
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
