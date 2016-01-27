package com.myla.thread.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

import jdk.nashorn.internal.codegen.CompilerConstants;

/**
 * Created by venkateswara.km on 10/01/16.
 */
public class WorkerThreadService implements Callable<List<Future>> {

  private BlockingQueue<String> dataStore;
  private int workerThreadCount = 10;

  public WorkerThreadService(BlockingQueue<String> dataStore,int workerThreadCount){
    this.dataStore = dataStore;
    if(workerThreadCount>1&&workerThreadCount<100){
      this.workerThreadCount = workerThreadCount;
    }
  }
  public List<Future> call() throws Exception{
    List<Future> futureList = new ArrayList<Future>();
    for(int i=0;i<this.workerThreadCount;i++){
      //futureList.add(new Worker(this.dataStore))
    }
    return null;
  }
}
