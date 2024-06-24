package com.lld.design_patterns.observer;

public class DisplayTemperatureScreen implements Observer{
  @Override
  public void update(double temp, double humidity) {
    System.out.println("Temperature is " + temp + " degree celsius");
  }
}
