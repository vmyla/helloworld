package com.myla.thread.bean;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;

/**
 * Created by venkateswara.km on 10/01/16.
 */
public class Producer implements Callable<Boolean> {

  BlockingQueue<String> dataStore = null;
  public Producer(BlockingQueue<String> dataStore){
    this.dataStore = dataStore;
  }

  public Boolean call() throws Exception{
    String threadName = Thread.currentThread().getName();
    for(int i=0;i<10000;i++){
      this.dataStore.put(threadName+"_"+i);
    }
    return true;
  }
}
