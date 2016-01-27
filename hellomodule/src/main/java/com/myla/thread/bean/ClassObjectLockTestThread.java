package com.myla.thread.bean;

/**
 * Created by venkateswara.km on 15/01/16.
 */
public class ClassObjectLockTestThread implements Runnable{

  private ClassObjectLockTestObj classObjectLockTestObj;
  public ClassObjectLockTestThread(ClassObjectLockTestObj obj){
    this.classObjectLockTestObj = obj;
  }

  public void run(){
    if(Thread.currentThread().getName().equalsIgnoreCase("thread1")){
      this.classObjectLockTestObj.sayGoddBye();
    }else{
      //this.classObjectLockTestObj.sa
      ClassObjectLockTestObj.sayHello();
    }
  }

}
