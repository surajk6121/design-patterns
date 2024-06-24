package com.lld.design_patterns.system.dominos;

public class ExtraCheese extends PizzaDecorator {
  private Pizza pizza;

  public ExtraCheese (Pizza pizza) {
    this.pizza = pizza;
  }

  @Override
  public String getDescription() {
    return pizza.getDescription() + " " + "with extra cheese";
  }

  @Override
  public double getCost() {
    return pizza.getCost() + 10;
  }

}
