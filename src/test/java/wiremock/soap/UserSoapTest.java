package wiremock.soap;

import static com.consol.citrus.ws.actions.SoapActionBuilder.soap;

import com.consol.citrus.annotations.CitrusTest;
import com.consol.citrus.testng.spring.TestNGCitrusSpringSupport;
import org.springframework.test.context.ContextConfiguration;
import org.testng.annotations.Test;

@ContextConfiguration(classes = com.consol.citrus.config.CitrusSpringConfig.class)
public class UserSoapTest extends TestNGCitrusSpringSupport {

  @Test
  @CitrusTest
  public void getUserSoap() {
    run(soap()
        .client("soapClient")
        .send()
        .message()
    );

    run(soap()
        .client("soapClient")
        .receive()
        .message()
        .body("<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
            + "<m:getUserResponse xmlns:m=\"http://example.com/user\">"
            + "<m:name>Test user</m:name>"
            + "</m:getUserResponse>")
    );
  }
}
