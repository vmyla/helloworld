package com.myla.thread.bean;

/**
 * Created by venkateswara.km on 09/01/16.
 */
public class GuessANumber extends Thread {

  private int valueToGuess;
  public GuessANumber(int value){
    this.valueToGuess = value;
  }

  public void run(){
    int randomValue = -1;
    int counter = 0;
    do{
      randomValue = (int)(Math.random()*1000000000+1);
      counter++;
    }while(valueToGuess!=randomValue);
    System.out.println("Guessed number correctly in "+counter+" attempts");
    System.out.println("Thread "+Thread.currentThread().getName()+" is completed");
  }
}
