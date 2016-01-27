package com.myla;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

  public static boolean isPrime(int n){
    if(n==1||n==2){
      return true;
    }
    int sqrtVal = ((Double)Math.sqrt(n)).intValue();
    for(int i=2;i<=sqrtVal;i++){
      if(n%i==0){
        return false;
      }
    }
    return true;
  }
  public static void main(String[] args) {
        /* Enter your code here. */
    //Scanner in = new Scanner(System.in);
    //int testCount = in.nextInt();
    //int testCase = 0;
    //while(testCount>0 && testCount<=20 && testCase<testCount){
      //if(in.hasNext()){
        //int inputVal = in.nextInt();
    int inputVal = 2000000000;
        if(inputVal>=1 && inputVal<=2000000000){
          if(isPrime(inputVal)){
            System.out.println("Prime");
          }else{
            System.out.println("Not prime");
          }
        }else{
          System.out.println("Not prime");
        }
      //}else{
       // System.out.println("Not prime");
      //}
      //testCase++;
    //}
  }
}
