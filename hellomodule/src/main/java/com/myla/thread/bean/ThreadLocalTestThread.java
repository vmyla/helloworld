package com.myla.thread.bean;

import com.myla.bean.Node;

/**
 * Created by venkateswara.km on 09/01/16.
 */
public class ThreadLocalTestThread implements Runnable {

  private ThreadLocal<Node> threadLocal = null;
  public ThreadLocalTestThread(ThreadLocal<Node> threadLocalNode){
    this.threadLocal = threadLocalNode;
  }
  public void run(){
    System.out.println("Current Thread "+Thread.currentThread().getName()+" "+threadLocal.get().getData()+" "+threadLocal.get().hashCode());
  }
}
