package org.example.services;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

import org.example.models.CourseModel;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CourseService extends AbsBaseService {
  public List<CourseModel> getAllCourses() {
    return given(requestSpecification())
        .when()
        .get("/course/get/all")
        .then()
        .body(matchesJsonSchemaInClasspath("schemas/courses.json"))
        .spec(responseSpecification())
        .extract()
        .jsonPath()
        .getList("", CourseModel.class);
  }
}