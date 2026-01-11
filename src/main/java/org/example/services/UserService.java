package org.example.services;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

import org.example.models.ScoreModel;
import org.example.models.UserModel;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService extends AbsBaseService {
  public ScoreModel getUserScoreByUserId(int id) {
    return given(requestSpecification())
        .when()
        .get("/user/get/" + id)
        .then()
        .assertThat()
        .body(matchesJsonSchemaInClasspath("schemas/score.json"))
        .spec(responseSpecification())
        .extract()
        .as(ScoreModel.class);
  }

  public List<UserModel> getAllUsers() {
    return given(requestSpecification())
        .when()
        .get("/user/get/all")
        .then()
        .assertThat()
        .body(matchesJsonSchemaInClasspath("schemas/users.json"))
        .spec(responseSpecification())
        .extract()
        .jsonPath()
        .getList("", UserModel.class);
  }
}
