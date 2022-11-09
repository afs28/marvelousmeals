CREATE TABLE IF NOT EXISTS recipe (
                                      recipeID SERIAL,
                                      title VARCHAR,
                                      description VARCHAR,
                                      difficultyLevel VARCHAR,
                                      allergyFactors VARCHAR,
                                      comments VARCHAR,
                                      ratings VARCHAR,
                                      imageOfRecipe VARCHAR,
                                      forNumberOfPeople VARCHAR,
                                      prepTime VARCHAR,
                                      PRIMARY KEY (recipeID)
    );

CREATE TABLE IF NOT EXISTS recipeuser (
                                          recipeUserID SERIAL,
                                          recipeUsername VARCHAR NOT NULL,
                                          recipeUserPassword VARCHAR NOT NULL,
                                          PRIMARY KEY (recipeUserID)
    );
DROP TABLE IF EXISTS public.recipecomment;
CREATE TABLE IF NOT EXISTS public.recipecomment (
                                                    commentID SERIAL,
                                                    recipecomment VARCHAR,
                                                    --userID INT,
                                                    nickname VARCHAR,
                                                    recipeID INT,
                                                    PRIMARY KEY (commentID),
                                                    --CONSTRAINT fk_user
                                                        --FOREIGN KEY(userID)
                                                            --REFERENCES recipeuser(recipeuserID),
                                                    CONSTRAINT fk_recipe
                                                        FOREIGN KEY(recipeID)
                                                            REFERENCES recipe(recipeID)
);