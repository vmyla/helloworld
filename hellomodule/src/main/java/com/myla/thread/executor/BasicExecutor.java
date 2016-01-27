package com.myla.thread.executor;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by venkateswara.km on 10/01/16.
 */
public class BasicExecutor {

  /*public static void main(String[] args){
    ExecutorService executor = Executors.newFixedThreadPool(10);
    for(int i=0;i<100;i++){
      Runnable thread = new Runnable() {
        private int threadData;

        @Override
        public void run() {
          System.out.println(Thread.currentThread().getName() + " "+threadData);
        }

        public Runnable setThreadData(int val) {
          this.threadData = val;
          return this;
        }
      }.setThreadData(i);

      executor.execute(thread);
      Future future = executor.submit(thread,"Myla"+i);

      while(true){
        try{
          if(future.isDone()){
            System.out.println("Thread execution completed and result is "+future.get());
            break;
          }
        }catch (Exception e){
          e.printStackTrace();
          break;
        }

      }
    }
    if(!executor.isShutdown()){
      executor.shutdown();
    }
  }*/

  public static void main(String[] args){
    ExecutorService executor = Executors.newFixedThreadPool(10);
    for(int i=0;i<100;i++){
      Callable thread = new Callable<String>() {
        private int threadData;

        @Override
        public String call() {
          System.out.println(Thread.currentThread().getName() + " "+threadData);
          return "successful"+threadData;
        }

        public Callable setThreadData(int val) {
          this.threadData = val;
          return this;
        }
      }.setThreadData(i);

      Runnable runnable = new Runnable() {
        @Override
        public void run() {
          System.out.println("thread implementing runnable interface");
        }
      };

      //executor.execute(thread);
      //executor.submit(thread)
      Future future = executor.submit(runnable);

      while(true){
        try{
          if(future.isDone()){
            System.out.println("Thread execution completed and result is "+future.get());
            break;
          }
        }catch (Exception e){
          e.printStackTrace();
          break;
        }

      }
    }
    if(!executor.isShutdown()){
      executor.shutdown();
    }
  }

}
