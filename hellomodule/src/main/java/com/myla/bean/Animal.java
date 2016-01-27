package com.myla.bean;

/**
 * Created by venkateswara.km on 04/01/16.
 */
public class Animal {

  protected int numberOfLegs = 0;
  protected String getName(){
    return "BaseClass";
  }

  public Animal get(){
    System.out.println("in Animal get method");
    return this;
  }

  public static String sayHello(){
    return "Hello";
  }
}
