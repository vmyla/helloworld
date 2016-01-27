package com.myla;

/**
 * Created by venkateswara.km on 20/12/15.
 */
public class TestCombinations {

  public static void main(String[] args){
    TestCombinations testCombinations = new TestCombinations();
    int input[] = new int[]{12,13,14,15};
    int data[] = new int[6];
    testCombinations.generateCombinations(input,3,0,3,data);
  }

  public void generateCombinations(int input[], int startIndex, int count, int size, int result[]){
    if(startIndex<0){
      if(count==size){
        for(int i=0;i<size;i++){
          System.out.print(result[i]+" ");
        }
        System.out.println();
        //return result;
      }
      //System.out.println(result);
      return;
    }

    if(count==size){
      for(int i=0;i<size;i++){
        System.out.print(result[i]+" ");
      }
      System.out.println();
      //return result;
    }

    if(count < size){
      result[count] = input[startIndex];
      generateCombinations(input,startIndex-1,count+1,size,result);
      //System.out.println(result);
      generateCombinations(input,startIndex-1,count,size,result);
      //System.out.println(result);
    }

    return;
  }

}
