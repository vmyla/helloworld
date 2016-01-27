package com.myla.generics;

import java.util.ArrayList;

/**
 * Created by venkateswara.km on 25/01/16.
 */
public class GenericMethodExample {

  /*
    How to define generic methods
    1. How to define type arguments
    2. How to define return type
    3. Can we have more than one generic type
   */
  //Method with no return type and single generic argument
  //Method which display the type of input parameter
  public static <T> void parameterName(T data){
    System.out.println("input type is:"+data.getClass().getName());
  }
  //Method which accepts different type of arguments
  public static <T,E> void differentTypeParameters(T data, E data1){
    System.out.println("param1 type:" + data.getClass().getName());
    System.out.println("param2 type:"+data1.getClass().getName());
  }

  public static <T,E> E returnTypes(T data, E data1){
    E obj = data1;
    return obj;
  }

  public static <T extends Integer> T addValue(T data){
    return data;
  }
  public static void main(String[] args){
    parameterName(new Integer(10));
    differentTypeParameters(new Integer(10),new ArrayList<>());
    int a = new Integer(10);
    addValue(a)                                                 ;
  }
}
