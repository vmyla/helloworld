package com.myla.thread;

import com.myla.bean.Node;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by venkateswara.km on 06/01/16.
 */
public class ConcurrentHashMapThread extends Thread {

  private HashMap<String,String> test;
  private ConcurrentHashMap<Node,Node> concurrentHashMap = new ConcurrentHashMap<Node,Node>();
  public ConcurrentHashMapThread(ConcurrentHashMap<Node,Node> concurrentHashMap){
    if(concurrentHashMap!=null){
      this.concurrentHashMap = concurrentHashMap;
    }
  }

  public void run() {
    int count = 0;
    while(true){
      Node temp = new Node(count);
      count++;
      System.out.println("adding value "+temp.getData());
      this.concurrentHashMap.put(temp,temp);
      try{
        sleep(500);
      }catch (InterruptedException e){

      }
    }

    /*for (int i = 0; i < 100; i++) {
      if (this.getName().equalsIgnoreCase("thread1")) {

        Iterator iterator = concurrentHashMap.keySet().iterator();
        while (!iterator.hasNext()&&i++<100) {
          Node temp = new Node(i);
          concurrentHashMap.put(temp, temp);
          iterator = concurrentHashMap.keySet().iterator();
          if(iterator.hasNext()){
            Node val = (Node)iterator.next();
            //System.out.println("In Thread" + this.getName() + ":" + val.getData());
          }

        }
      }else{
        Iterator iterator1 = concurrentHashMap.keySet().iterator();
        while(true){
          if(iterator1.hasNext()){
            Node node = (Node)iterator1.next();
            System.out.println(this.getName()+":"+node.getData());
          }
        }
      }
      System.out.println("Total elements in " + this.getName());
    }*/
  }
}
