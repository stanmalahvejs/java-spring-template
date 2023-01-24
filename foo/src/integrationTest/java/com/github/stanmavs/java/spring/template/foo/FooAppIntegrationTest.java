package com.github.stanmavs.java.spring.template.foo;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

import io.restassured.RestAssured;
import lombok.Setter;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class FooAppIntegrationTest {

  @LocalServerPort private int port;

  @BeforeEach
  public void configureRestAssured() {
    RestAssured.baseURI = "http://localhost";
    RestAssured.port = port;
  }

  @Test
  public void itShouldGetFoo() {
    // arrange

    // spotless:off
    // act
    GetFooResponse actualResponse =
        given()
            .get("/api/v1/foo/345")
            .then()
            .

    // assert
    assertThat()
        .statusCode(HttpStatus.SC_OK)
        .extract()
        .as(GetFooResponse.class);

    // spotless:on
    assertEquals(345, actualResponse.id);
    assertEquals("Foo id: 345", actualResponse.bar);
  }

  @Setter
  private static class GetFooResponse {
    private int id;
    private String bar;
  }
}
