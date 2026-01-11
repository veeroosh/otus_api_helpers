package wiremock.http;

import static org.assertj.core.api.SoftAssertions.assertSoftly;

import org.example.models.CourseModel;
import org.example.models.builders.CourseModelBuilder;
import org.example.spring.AbsBaseTest;
import org.testng.annotations.Test;
import java.util.List;

public class CourseTest extends AbsBaseTest {

  @Test
  public void checkGetAllCourses() {
    List<CourseModel> courseModels = courseService.getAllCourses();

    assertSoftly(softly -> softly.assertThat(courseModels).isEqualTo(CourseModelBuilder.getCourcesModels()));
  }
}
