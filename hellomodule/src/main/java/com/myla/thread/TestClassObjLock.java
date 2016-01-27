package com.myla.thread;

import com.myla.thread.bean.ClassObjectLockTestObj;
import com.myla.thread.bean.ClassObjectLockTestThread;

/**
 * Created by venkateswara.km on 15/01/16.
 */
public class TestClassObjLock {

  public static void main(String[] args){
    ClassObjectLockTestObj classObjectLockTestObj = new ClassObjectLockTestObj();
    ClassObjectLockTestThread testThread = new ClassObjectLockTestThread(classObjectLockTestObj);
    Thread thread1 = new Thread(testThread);
    thread1.setName("thread1");

    ClassObjectLockTestThread testThread1 = new ClassObjectLockTestThread(classObjectLockTestObj);
    Thread thread2 = new Thread(testThread1);
    thread2.setName("thread2");

    thread1.start();
    thread2.start();
  }

}
