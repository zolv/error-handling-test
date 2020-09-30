package com.test.api;

import javax.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Validated
public class TestController implements TestApi {
  @Override
  @ResponseBody
  public ResponseEntity<TestEntity> getTest(@Valid @RequestBody TestEntity request) {
    return ResponseEntity.ok(request);
  }
}
