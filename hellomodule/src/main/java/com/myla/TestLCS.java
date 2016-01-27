package com.myla;

/**
 * Created by venkateswara.km on 24/12/15.
 */
public class TestLCS {

  public static void main(String[] args){
    TestLCS testLCS = new TestLCS();
    char inputString[] = new char[]{'A','A','B','A','A','C','A','A','D','A','A','B','A','A','A','B','A','A'};
    char searchString[] = new char[]{'A','A','B','A'};
    testLCS.findPatterns(inputString,searchString,inputString.length-1,searchString.length-1,-1);

  }

  public int findPatterns(char inputString[] ,char searchStr[], int inputStringInd, int searchStrInd, int foundInd){
    int result = -1;
    if(searchStrInd<0){
      if(foundInd>=0){
        System.out.println(foundInd);
      }
      return -1;
    }

    if(inputStringInd<0){
      return -1;
    }

    if(inputString[inputStringInd]==searchStr[searchStrInd]){
      findPatterns(inputString,searchStr,inputStringInd-1,searchStrInd-1,searchStrInd-1<0?inputStringInd:-1);
      findPatterns(inputString,searchStr,inputStringInd-1,searchStr.length-1,-1);
    }

    return result;
  }

}
