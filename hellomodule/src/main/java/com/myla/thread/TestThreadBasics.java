package com.myla.thread;

import com.myla.thread.bean.DisplayMessage;
import com.myla.thread.bean.GuessANumber;

/**
 * Created by venkateswara.km on 09/01/16.
 */
public class TestThreadBasics {

  public static void main(String[] args){
    DisplayMessage hello = new DisplayMessage("Hello",null);
    Thread helloThread = new Thread(hello);
    helloThread.setName("hello thread");
    System.out.println("Starting display message Hello Thread");
    helloThread.start();

    GuessANumber numberGuessThread = new GuessANumber(10000057);

    numberGuessThread.setName("number guess thread");
    DisplayMessage goodBye = new DisplayMessage("Good bye",numberGuessThread);
    Thread goodByeThread = new Thread(goodBye);
    goodByeThread.setName("good bye thread");
    System.out.println("Starting Good Bye Thread");
    numberGuessThread.start();
    goodByeThread.start();
    try{
      Thread.sleep(5000);
    }catch(InterruptedException e){
      e.printStackTrace();
      System.out.println("wait is completed");
    }


  }
}
