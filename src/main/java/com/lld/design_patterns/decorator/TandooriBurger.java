package com.lld.design_patterns.decorator;

public class TandooriBurger extends Burger {
  @Override
  public String getDescription() {
    return "Tandoori Burger";
  }

  @Override
  public double getCost() {
    return 110;
  }
}
