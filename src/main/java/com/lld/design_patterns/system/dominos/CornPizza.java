package com.lld.design_patterns.system.dominos;

public class CornPizza extends Pizza {
  @Override
  public String getDescription() {
    return "Corn Pizza";
  }

  @Override
  public double getCost() {
    return 100;
  }
}
