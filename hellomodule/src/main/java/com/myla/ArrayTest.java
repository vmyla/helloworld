package com.myla;

/**
 * Created by venkateswara.km on 11/01/16.
 */
public class ArrayTest {

  public static void main(String[] args){
    //int[][] data = new int[][]{{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5}};
    int[][] data = new int[][]{{1,2,3},{1,2,3},{1,2,3}};
    ArrayTest arrayTest = new ArrayTest();
    int count = arrayTest.totalCount(data,2,1,3,3);
    System.out.println("total moves are "+count);
  }

  public int totalCount(int[][] data, int i, int j, int m, int n){
    int count = 0;
    if(i<0||i>=m||j<0||j>=n)
      return 0;
    if(data[i][j]!=-1){
      data[i][j]=-1;
      count = 1 + totalCount(data,i+1,j+2,m,n)+
              totalCount(data,i+1,j-2,m,n)+
              totalCount(data,i-1,j+2,m,n)+
              totalCount(data,i-1,j-2,m,n)+
              totalCount(data,i+2,j+1,m,n)+
              totalCount(data,i+2,j-1,m,n)+
              totalCount(data,i-2,j+1,m,n)+
              totalCount(data,i-2,j-1,m,n);
    }
    return count;
  }
}
