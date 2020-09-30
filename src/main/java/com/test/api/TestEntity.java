package com.test.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.constraints.NotNull;
import lombok.Data;

@Data
public class TestEntity {
  @JsonProperty("test")
  @NotNull
  private String test;
}
