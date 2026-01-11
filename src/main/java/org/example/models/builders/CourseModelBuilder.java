package org.example.models.builders;

import org.example.models.CourseModel;
import java.util.List;

public class CourseModelBuilder {
  public static List<CourseModel> getCourcesModels() {
    return List.of(
        CourseModel.builder()
            .name("QA java")
            .price(15000)
            .build(),
        CourseModel.builder()
            .name("Java")
            .price(12000)
            .build()
    );
  }
}
