package com.lld.design_patterns.builder;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BuilderApplication {
  public static void main(String[] args) {
    Dog dog = new Dog.DogBuilder().setName("Rio")
      .setGender("TRANS").build();
    log.info("Dog name: {} Dog Gender: {}", dog.getName(), dog.getGender());
  }
}
