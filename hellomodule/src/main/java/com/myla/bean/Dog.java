package com.myla.bean;

/**
 * Created by venkateswara.km on 04/01/16.
 */
public class Dog extends Animal {

  protected int numberOfLegs;
  public Dog(int numberOfLegs){
    this.numberOfLegs = numberOfLegs;
  }

  public Dog get(){
    System.out.println("in Dog get method");
    return this;
  }
  protected String getName(){
    return "Dog Class";
  }

  public static String sayHello(){
    return "Hello Dog";
  }
}
