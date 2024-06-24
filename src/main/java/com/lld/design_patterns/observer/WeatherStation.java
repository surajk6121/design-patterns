package com.lld.design_patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Observable{
  private List<Observer> observers;
  private double temp;
  private double humidity;

  public WeatherStation() {
    this.observers = new ArrayList<>();
  }

  public boolean hasObserver(Observer observer) {
    return observers.contains(observer);
  }

  @Override
  public void registerObserver(Observer observer) {
    if(!hasObserver(observer))
      observers.add(observer);
  }

  @Override
  public void removeObserver(Observer observer) {
    if(!hasObserver(observer))
      observers.remove(observer);
  }

  @Override
  public void notifyObservers() {
    observers.forEach(observer -> observer.update(temp, humidity));
  }

  public void parameterChanged(double temp, double humidity) {
    this.temp = temp;
    this.humidity = humidity;
    notifyObservers();
  }
}
