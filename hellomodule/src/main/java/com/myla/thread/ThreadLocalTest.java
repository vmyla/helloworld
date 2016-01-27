package com.myla.thread;

import com.myla.bean.Node;
import com.myla.thread.bean.ThreadLocalTestThread;

/**
 * Created by venkateswara.km on 09/01/16.
 */
public class ThreadLocalTest {

  private static final ThreadLocal<Node> threadLocal = new ThreadLocal<Node>(){
    public Node initialValue(){
      return new Node(100);
    }
  };



  public static void main(String[] args){
    ThreadLocalTestThread thread1 = new ThreadLocalTestThread(threadLocal);
    Thread th = new Thread(thread1);
    th.start();

    ThreadLocalTestThread thread2 = new ThreadLocalTestThread(threadLocal);
    Thread th1 = new Thread(thread2);
    th1.start();
  }
}
