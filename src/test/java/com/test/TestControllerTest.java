package com.test;

import com.test.api.TestEntity;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class TestControllerTest {

  @Autowired protected TestRestTemplate restTemplate;

  @Test
  void registrationHappyPath() throws Exception {
    /*
     * Given
     */
    final TestEntity request = new TestEntity();

    /*
     * When/
     */
    final ResponseEntity<String> response =
        restTemplate.postForEntity("/test", request, String.class);

    /*
     * Then
     */
    Assertions.assertEquals(HttpStatus.BAD_REQUEST, response.getStatusCode());

    final String body = response.getBody();
    Assertions.assertNotNull(body);
  }
}
