package com.myla.thread.bean;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;

import jdk.nashorn.internal.ir.Block;

/**
 * Created by venkateswara.km on 10/01/16.
 */
public class Consumer implements Callable<Boolean> {

  BlockingQueue<String> dataStore;
  public Consumer(BlockingQueue<String> dataStore){
    this.dataStore = dataStore;
  }
  public Boolean call() throws Exception{
    while(true){
      if(!this.dataStore.isEmpty()){
        System.out.print(this.dataStore.take()+" ");
      }
    }
  }
}
