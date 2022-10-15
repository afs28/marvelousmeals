package is.hi.hbv501g.hugbo.Persistence.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.swing.*;

@Entity
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private String title;
    private String author;
    private String description;
    private String difficultyLevel;
    private String allergyFactors;
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
