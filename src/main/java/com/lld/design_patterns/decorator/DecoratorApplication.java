package com.lld.design_patterns.decorator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DecoratorApplication {
  public static void main(String[] args) {
    Burger burger = new TandooriBurger();
    log.info("Description: {} Cost: {}", burger.getDescription(), burger.getCost());

    burger = new ExtraCheeseBurger(burger);
    log.info("Description: {} Cost: {}", burger.getDescription(), burger.getCost());

    burger = new ExtraMayoBurger(burger);
    log.info("Description: {} Cost: {}", burger.getDescription(), burger.getCost());

  }
}
