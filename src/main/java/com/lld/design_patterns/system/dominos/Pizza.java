package com.lld.design_patterns.system.dominos;

public abstract class Pizza extends Item {
  @Override
  public final Category getCategory() {
    return Category.PIZZA;
  }
}
