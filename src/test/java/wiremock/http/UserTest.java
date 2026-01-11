package wiremock.http;

import static org.assertj.core.api.SoftAssertions.assertSoftly;

import org.example.models.ScoreModel;
import org.example.models.UserModel;
import org.example.models.builders.ScoreModelBuilder;
import org.example.models.builders.UserModelBuilder;
import org.example.spring.AbsBaseTest;
import org.testng.annotations.Test;
import java.util.List;
import java.util.Random;

public class UserTest extends AbsBaseTest {

  @Test
  public void checkGetUserById() {
    ScoreModel scoreModel = userService.getUserScoreByUserId(new Random().nextInt());

    assertSoftly(softly -> softly.assertThat(scoreModel).isEqualTo(ScoreModelBuilder.getScoreModel()));
  }

  @Test
  public void checkGetAllUsers() {
    List<UserModel> userModels = userService.getAllUsers();

    assertSoftly(softly -> {
      softly.assertThat(userModels.size()).isEqualTo(1);
      softly.assertThat(userModels.get(0)).isEqualTo(UserModelBuilder.getUserModel());
    });
  }
}
