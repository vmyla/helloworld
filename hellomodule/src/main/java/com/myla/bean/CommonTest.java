package com.myla.bean;

import com.myla.bean.Animal;
import com.myla.bean.Dog;

import java.util.Collections;

/**
 * Created by venkateswara.km on 04/01/16.
 */
public class CommonTest {

  public static void main(Object[] args){
    System.out.println(" I am in object main");
  }

  public static void main(String[] args){
    Dog animal = new Dog(4);
    System.out.println(animal.sayHello());
    animal.get();
    Animal ani = new Animal();
    ani.get();
    Collections collections = null;

    CommonTest obj = new CommonTest();
    String a = "abc";
    String abc = "abc";
    String abcd = new String("abc");
    String b = new String("abc");
    System.out.println(a.equals(abc)+":"+(a==abc)+":"+(abc==abcd)+":"+(b==abcd));
  }



  public void swap(Integer val1, Integer val2){
    System.out.println("swap method start");
    System.out.println(val1);
    System.out.println(val2);
    Integer temp = val1;
    val1 = val2;
    val2 = temp;
    System.out.println(val1);
    System.out.println(val2);
    System.out.println("swap method end");
  }
}
