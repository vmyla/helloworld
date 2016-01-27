package com.myla.thread.bean;

/**
 * Created by venkateswara.km on 09/01/16.
 */
public class DisplayMessage implements Runnable {

  private String message;
  private Thread waitToCompleteThread = null;
  public DisplayMessage(String message, Thread waitToCompleteThread){
    this.message = message;
    this.waitToCompleteThread = waitToCompleteThread;
  }

  public void run(){
      try{
          if(waitToCompleteThread!=null){
            System.out.println("current thread "+ Thread.currentThread().getName()+" waiting for "+
                               waitToCompleteThread.getName()+" to be completed");
            waitToCompleteThread.join();
          }
      }catch(InterruptedException e){
        e.printStackTrace();

      }
    if(waitToCompleteThread != null){
      System.out.println(
          "Thread " + waitToCompleteThread.getName() + " is completed its execution and " + Thread.currentThread().getName()+" operation is started");
      try{
        Thread.sleep(5000);
      }catch (InterruptedException e){
        e.printStackTrace();
      }
      System.out.println(Thread.currentThread().getName()+" operation is completed successfully");
    }else{
      System.out.println(Thread.currentThread().getName() + ":" + message);
    }

  }
}
