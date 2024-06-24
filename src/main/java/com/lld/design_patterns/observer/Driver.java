package com.lld.design_patterns.observer;

public class Driver {
  public static void main(String[] args) {
    WeatherStation weatherStation = new WeatherStation();

    DisplayTemperatureScreen displayTemperatureScreen = new DisplayTemperatureScreen();

    weatherStation.registerObserver(displayTemperatureScreen);

    weatherStation.parameterChanged(39, 98);
  }
}
