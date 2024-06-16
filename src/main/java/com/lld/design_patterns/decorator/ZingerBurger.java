package com.lld.design_patterns.decorator;

public class ZingerBurger extends Burger{

  @Override
  public String getDescription() {
    return "Zinger Burger";
  }

  @Override
  public double getCost() {
    return 150;
  }
}
