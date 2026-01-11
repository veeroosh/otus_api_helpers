package org.example.spring;

import org.example.services.CourseService;
import org.example.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

@SpringBootTest(classes = SpringTestApplication.class)
public abstract class AbsBaseTest extends AbstractTestNGSpringContextTests {
  @Autowired
  protected UserService userService;

  @Autowired
  protected CourseService courseService;
}
