package com.myla.thread.bean;

/**
 * Created by venkateswara.km on 15/01/16.
 */
public class ClassObjectLockTestObj {

  public static void sayHello(){
    System.out.println(Thread.currentThread().getName()+": I am in say Hello");
    while(true){

    }
  }

  public synchronized void sayGoddBye(){
    System.out.println(Thread.currentThread().getName()+": GoodBye");
    while(true){

    }

  }
}
