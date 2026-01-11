package org.example.models.builders;

import org.example.models.UserModel;

public class UserModelBuilder {
  public static UserModel getUserModel() {
    return UserModel.builder()
        .id(1)
        .name("Test user")
        .course("QA")
        .email("test@test.test")
        .age(23)
        .build();
  }
}
