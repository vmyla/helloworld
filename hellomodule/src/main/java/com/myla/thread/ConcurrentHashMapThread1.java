package com.myla.thread;

import com.myla.bean.Node;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * Created by venkateswara.km on 18/01/16.
 */
public class ConcurrentHashMapThread1 extends Thread {

  private ConcurrentMap<Node,Node> concurrentHashMap = new ConcurrentHashMap<Node,Node>();

  public ConcurrentHashMapThread1(ConcurrentHashMap<Node,Node> concurrentHashMap){
    if(concurrentHashMap!=null){
      this.concurrentHashMap = concurrentHashMap;
    }

  }
  public void run(){
    Set<Node> values = this.concurrentHashMap.keySet();
    try{
      sleep(5000);
    }catch (InterruptedException e){

    }
    Iterator iter = values.iterator();
    int size = values.size();
    while(true){

/*      while(values.size()>size){
        System.out.println(Thread.currentThread().getName()+":"+values.size());
        size = values.size();
      }*/
      while(iter.hasNext()){
        System.out.print(Thread.currentThread().getName()+":"+((Node)iter.next()).getData());
      }
    }
  }
}
