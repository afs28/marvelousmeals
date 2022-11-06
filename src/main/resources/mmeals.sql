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