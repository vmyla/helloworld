package com.myla.thread;

/**
 * Created by venkateswara.km on 08/01/16.
 */
public class NativeDataTypesTest {

  public static void main(String[] args){
    Integer val1 = 10;
    Integer val2 = 20;
    System.out.println("Before Swap val1:"+val1+" val2:"+val2);
    NativeDataTypesTest obj = new NativeDataTypesTest();
    obj.swapValues(val1,val2);
    System.out.println("After Swap val1:"+val1+" val2:"+val2);
    int val = 100;

  }

  public void swapValues(Integer val1, Integer val2){
    Integer val3 = val1;
    val1 = val2;
    val2 = val3;
    System.out.println("In SwapValues val1:"+val1+" val2:"+val2);
  }
}
