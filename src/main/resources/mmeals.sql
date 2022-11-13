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
DROP TABLE IF EXISTS recipecomment;
CREATE TABLE IF NOT EXISTS recipecomment (
                                                    commentID SERIAL,
                                                    mycomment VARCHAR,
                                                    --userID INT,
                                                    nickname VARCHAR,
                                                    recipeID INT NOT NULL,
                                                    PRIMARY KEY (commentID),
                                                    --CONSTRAINT fk_user
                                                        --FOREIGN KEY(userID)
                                                            --REFERENCES recipeuser(recipeuserID),
                                                    CONSTRAINT fk_recipe
                                                        FOREIGN KEY(recipeID)
                                                            REFERENCES recipe(recipeID)
);

DROP TABLE IF EXISTS reciperating;
CREATE TABLE IF NOT EXISTS reciperating (
                                                    ratingID SERIAL,
                                                    reciperating VARCHAR,
                                                    --userID INT,
                                                    nickname VARCHAR,
                                                    recipeID INT,
                                                    PRIMARY KEY (ratingID),
                                                    --CONSTRAINT fk_user
                                                    --FOREIGN KEY(userID)
                                                    --REFERENCES recipeuser(recipeuserID),
                                                    CONSTRAINT fk_recipe
                                                        FOREIGN KEY(recipeID)
                                                            REFERENCES recipe(recipeID)
    );