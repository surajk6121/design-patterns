package com.lld.design_patterns.system.dominos;

public class OnionPizza extends Pizza {
  @Override
  public String getDescription() {
    return "Onion Pizza";
  }

  @Override
  public double getCost() {
    return 90;
  }
}
