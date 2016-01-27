package com.myla.map;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Collection;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by venkateswara.km on 25/12/15.
 */
public class MapTest {

  public static void main(String[] args){
    Set sampleSet;
    NavigableSet navigableSet;
    SortedSet sortedSet;
    TreeSet treeSet;
    ArrayList lists;
    int val = 16;
    char arr[] = new char[]{'m','y','l','a'};
    String val1 = "";
    Date temp = new Date();
    Date temp1 = (Date)temp.clone();
    System.out.println(temp+" "+temp1);

    System.out.println((val|(val >>> 1))+" "+(val >>> 2));
    System.out.println(arr);
/*
    Map<String, String> telephoneDict = new HashMap<String,String>();
    for(int i=0;i<70000000;i++){
      String val = "string_"+i;
        telephoneDict.put(val,val);
    }
    acxz
bcxz
*/

    //System.out.println("Number of entries in telephone directory are "+telephoneDict.size());
    String string1 = "bcxz";
    //for(int i=0;i<testCases;i++){
/*      String inputString = string1;
      if(inputString.length() > 10000){
        System.out.println("Not Funny");
      }else{
        int strLength = inputString.length();
        int j=1,k=inputString.length()-1;
        int valid = -1;
        while(j<=strLength-1 && k>=1){
          int val1 = inputString.charAt(j)- inputString.charAt(j-1);
          val1 = val1<0?val1*-1:val1;
          int val2 = inputString.charAt(k-1)-inputString.charAt(k);
          val2 = val2<0?val2*-1:val2;
          if(val1!=val2){
            valid = -2;
            break;
          }else{
            j++;k--;
            valid = 1;
          }
        }

        if(valid==1){
          System.out.println("Funny");
        }else{
          System.out.println("Not Funny");
        }
      }*/
    }

}
