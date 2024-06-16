package com.lld.design_patterns.decorator;

public abstract class Burger {
  private String description;
  private double cost;

  public abstract String getDescription();
  public abstract double getCost();

}
