package org.example.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"org.example"})
public class SpringTestApplication {
  public static void main(String[] args) {
    SpringApplication.run(SpringTestApplication.class, args);
  }
}
