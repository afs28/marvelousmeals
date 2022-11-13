package is.hi.hbv501g.hugbo.Persistence.Entities;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name="recipecomment")
public class RecipeComments  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "commentid")
    private Long commentID;
    @Column(name = "mycomment")
    private String myComment;
    @Column(name = "nickname")
    private String nickname;
    @NotNull
    @Column(name = "recipeid")
    private Long recipeID;



    public void setCommentID(Long commentID) {
        this.commentID = commentID;
    }
    public Long getCommentID() {
        return commentID;
    }

    public void setMyComment(String recipeComment) {
        this.myComment = recipeComment;
    }
    public String getMyComment() {
        return myComment;
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
