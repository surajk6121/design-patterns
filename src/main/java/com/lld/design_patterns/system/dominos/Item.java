package com.lld.design_patterns.system.dominos;

public abstract class Item {
  private String description;
  private double cost;
  private Category category;

  public abstract String getDescription();
  public abstract double getCost();
  public abstract Category getCategory();
}