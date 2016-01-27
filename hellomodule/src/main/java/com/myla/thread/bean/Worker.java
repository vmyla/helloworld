package com.myla.thread.bean;

import com.myla.thread.BlockingQueueTest;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;

/**
 * Created by venkateswara.km on 10/01/16.
 */
public class Worker implements Callable<Boolean> {

  private BlockingQueue dataStore;
  public Worker(BlockingQueue<String> dataStore){
    this.dataStore = dataStore;
  }

  public Boolean call() throws Exception{
    while(true){
      if(!this.dataStore.isEmpty()){
        //System.out.println(this.dataStore.take());
      }
    }
  }
}
