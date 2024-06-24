package com.lld.design_patterns.system.dominos;

public class ExtraToppings extends PizzaDecorator {
  private Pizza pizza;

  public ExtraToppings (Pizza pizza) {
    this.pizza = pizza;
  }

  @Override
  public String getDescription() {
    return pizza.getDescription() + " " + "with extra toppings";
  }

  @Override
  public double getCost() {
    return pizza.getCost() + 20;
  }
}
