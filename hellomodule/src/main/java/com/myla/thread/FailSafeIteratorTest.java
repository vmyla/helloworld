package com.myla.thread;

import com.myla.bean.Node;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by venkateswara.km on 06/01/16.
 */
public class FailSafeIteratorTest {

  private ConcurrentHashMap<Node,Node> concurrentHashMap = new ConcurrentHashMap<Node,Node>();
  public static void main(String[] args){
    FailSafeIteratorTest failSafeIteratorTest = new FailSafeIteratorTest();
    ConcurrentHashMapThread thread1 = new ConcurrentHashMapThread(failSafeIteratorTest.concurrentHashMap);
    thread1.setName("thread1");
    ConcurrentHashMapThread1 thread2 = new ConcurrentHashMapThread1(failSafeIteratorTest.concurrentHashMap);
    thread2.setName("thread2");
    thread1.start();
    thread2.start();
  }
}
