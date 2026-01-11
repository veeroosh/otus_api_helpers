package org.example.models.builders;

import org.example.models.ScoreModel;

public class ScoreModelBuilder {
  public static ScoreModel getScoreModel() {
    return ScoreModel.builder()
        .name("Test user")
        .score(78)
        .build();
  }
}
