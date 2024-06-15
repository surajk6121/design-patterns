package com.lld.design_patterns.builder;

public class Dog {
  private String name;
  private String gender;
  private String breed;

  public String getName() {
    return name;
  }

  public String getGender() {
    return gender;
  }

  public String getBreed() {
    return breed;
  }

  public double getPrice() {
    return price;
  }

  private double price;

  public Dog (DogBuilder dogBuilder) {
    this.name = dogBuilder.getName();
    this.breed = dogBuilder.getBreed();
    this.gender = dogBuilder.getGender();
    this.price = dogBuilder.getPrice();
  }

  public static class DogBuilder {
    private String name;
    private String gender;
    private String breed;
    private double price;

    public DogBuilder () {

    }

    public String getName() {
      return name;
    }

    public String getGender() {
      return gender;
    }

    public String getBreed() {
      return breed;
    }

    public double getPrice() {
      return price;
    }

    public DogBuilder setName(String name) {
      this.name = name;
      return this;
    }

    public DogBuilder setGender(String gender) {
      this.gender = gender;
      return this;
    }

    public DogBuilder setBreed(String breed) {
      this.breed = breed;
      return this;
    }

    public DogBuilder setPrice(double price) {
      this.price = price;
      return this;
    }

    public Dog build () {
      return new Dog(this);
    }
  }
}
