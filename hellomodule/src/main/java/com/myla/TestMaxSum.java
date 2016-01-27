package com.myla;

/**
 * Created by venkateswara.km on 20/12/15.
 */
public class TestMaxSum {

  public static void main(String[] args){
    int unit[] = new int[]{10,15,7,6,30,14};
    int time[] = new int[]{1,2,3,4,5,6};
    int permittedTime = 6;
    int m = 7;
    int n = 6;
    int result[][] = new int[m][n];
    for(int i=0;i<m;i++){
      for(int j=0;j<n;j++){
        result[i][j] = -1;
      }
    }
    TestMaxSum testMaxSum = new TestMaxSum();
    System.out.println(testMaxSum.computeMaxUnits(6, unit, time, 0,result));
    //testMaxSum.computeMaxUnits(15, unit, time, 6, result);
    for(int i=0;i<m;i++){
      for(int j=0;j<n;j++){
        System.out.print(result[i][j]+" ");
      }
      System.out.println();
    }
  }

  public int computeMaxUnits(int permittedTime,int[] unit, int[] time, int startIndex, int resultArray[][]){
    if(startIndex>unit.length-1){
      return 0;
    }
    int result = 0;
    if(permittedTime == 0){
      return 0;
    }
    if(resultArray[permittedTime][startIndex]!=-1){
      return resultArray[permittedTime][startIndex];
    }
    if(time[startIndex]>permittedTime) {
      result = computeMaxUnits(permittedTime,unit,time,startIndex+1,resultArray);
    }else {
      int val1 = unit[startIndex]+ computeMaxUnits(permittedTime-time[startIndex],unit,time,startIndex+1,resultArray);
      //resultArray[permittedTime-time[startIndex]][startIndex] = val1;
      int val2 = computeMaxUnits(permittedTime,unit,time,startIndex+1,resultArray);

      result= val1>val2?val1:val2;


    }
    resultArray[permittedTime][startIndex]=result;
    return result;
  }
}
