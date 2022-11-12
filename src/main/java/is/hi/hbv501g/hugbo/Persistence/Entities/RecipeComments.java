package is.hi.hbv501g.hugbo.Persistence.Entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "recipecomment")
public class RecipeComments implements Serializable {
    @Column(name = "nickname")
    private String nickname;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "commentid")
    private Long commentID;
    @Column(name = "recipecomment")
    private String recipeComment;
    @Column(name = "recipeid")
    private Long recipeID;

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setCommentID(Long commentID) {
        this.commentID = commentID;
    }
    @Id
    public Long getCommentID() {
        return commentID;
    }

    public void setRecipeComment(String recipeComment) {
        this.recipeComment = recipeComment;
    }
    public String getRecipeComment() {
        return recipeComment;
    }
    public void setRecipeID(Long recipeID){
        this.recipeID = recipeID;
    }
    public Long getRecipeID() {
        return recipeID;
    }
}
