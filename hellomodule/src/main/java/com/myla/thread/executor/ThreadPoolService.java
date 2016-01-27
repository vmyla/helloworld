package com.myla.thread.executor;

import com.myla.thread.bean.Producer;
import com.myla.thread.bean.Worker;
import com.myla.util.ListUtil;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by venkateswara.km on 10/01/16.
 */
public class ThreadPoolService {
  private static final int DEFAULT_CAPACITY = 10;
  private int poolCapacity = DEFAULT_CAPACITY;

  private List<Worker> workers = new ArrayList<Worker>();
  private List<Producer> producers = new ArrayList<Producer>();
  private BlockingQueue<String> dataStore = null;
  public ThreadPoolService(int poolSize){
    if(poolSize>0){
      this.poolCapacity = poolSize;
    }
  }

  public static void main(String[] args){
    ThreadPoolService threadPoolService = new ThreadPoolService(15);
    try{
      threadPoolService.start();
    }catch (Exception e){
      e.printStackTrace();
    }

    System.out.println("I am exititing");
  }

  public void start(){
    ExecutorService executorService = Executors.newFixedThreadPool(15);
    List<Future<Boolean>> workerFutures = new ArrayList<Future<Boolean>>();
    List<Future<Boolean>> producerFutures = null;
    initializeDataStore();
    initializeWorkers();
    initializeProducers();
    try{
      producerFutures = executorService.invokeAll(this.producers);
    }catch (InterruptedException e){
      e.printStackTrace();
    }
    for(Worker worker : workers){
      workerFutures.add(executorService.submit(worker));
    }

    System.out.println("successfully submitted all the workers");
    Iterator futureIterator = producerFutures.iterator();
    while(futureIterator.hasNext()){
        try{
          Future future = (Future)futureIterator.next();
          if(!future.isDone()){
            Thread.sleep(50);
          }else{
          }
        }catch (InterruptedException e){
          futureIterator = producerFutures.iterator();
        }
    }
    futureIterator = workerFutures.iterator();
    int count = 0;
    while(futureIterator.hasNext()){
      Future future = (Future)futureIterator.next();
      if(!future.isDone()){
        if(future.cancel(true)){
          System.out.println("Worker "+count++ +" is stopped");
        }
      }
    }

    while(futureIterator.hasNext()){
      Future future = (Future)futureIterator.next();
      if(!future.isCancelled()){
        System.out.println("Worker "+count++ +" not yet cancelled/stopped");
      }
    }
    System.out.println("successfully cancelled all workers");
    try{
      executorService.shutdownNow();
      if(executorService.isShutdown()){
        System.out.println("Executor Service is successfully shut down");
      }
    }catch (Exception e){
      e.printStackTrace();
    }

  }

  private void initializeProducers(){
    initializeDataStore();
    producers = new ArrayList<Producer>();
    for(int i=0;i<5;i++){
      Producer producer = new Producer(this.dataStore);
      producers.add(producer);
    }
    System.out.println("Producer threads are initialized");
  }

  private void initializeDataStore(){
    if(this.dataStore==null){
      dataStore = new LinkedBlockingQueue<String>();
      System.out.println("Data store is initialized");
    }

  }
  private void initializeWorkers(){
    initializeDataStore();
    workers = new ArrayList<Worker>();
    for(int i =0;i<poolCapacity;i++){
      Worker worker = new Worker(dataStore);
      workers.add(worker);

    }
    System.out.println("Worker threads are initialized");
  }

}
