package com.myla.list;

/**
 * Created by venkateswara.km on 25/12/15.
 */

import com.myla.bean.Node;
import com.myla.util.ListUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given a list, separate out it into two lists
 * 1. All Fibonacci numbers in one list
 * 2. Non-Fibonacci numbers in another list
 */
public class FibonacciList {

  private List fibonacciList = new ArrayList<>();
  private Map<Integer, Integer> fibonacciMap = new HashMap<Integer,Integer>();

  public static void main(String[] args){
    FibonacciList fibonacciList = new FibonacciList();
    int inputData[] = new int[]{12,13,144,98,34,88,21,57,72};
    fibonacciList.separateFibonacciAndNonFibonacci(inputData);
  }

  public void separateFibonacciAndNonFibonacci(int elements[]){
    Node root = ListUtil.constructList(elements);
    Node fibonacciListRoot = null;
    Node nonFibonacciListRoot = null;
    Node current = root;
    Node prevNode = null;
    while(current!=null){
      prevNode = current;
      Node temp = null;
      if(isFibonacciNum(prevNode.getData())){
        temp = ListUtil.addNode(fibonacciListRoot,prevNode.getData());
        if(fibonacciListRoot == null){
          fibonacciListRoot = temp;
        }
      }else{
        temp = ListUtil.addNode(nonFibonacciListRoot,prevNode.getData());
        if(nonFibonacciListRoot==null){
          nonFibonacciListRoot = temp;
        }
      }
      current = current.getRight();
    }
    current = fibonacciListRoot;
    System.out.println("Fibonacci Numbers");
    while(current!=null){
      prevNode = current;
      System.out.print(prevNode.getData()+" ");
      current = current.getRight();
    }
    System.out.println();
    current = nonFibonacciListRoot;
    System.out.println("Non Fibonacci Numbers");
    while(current!=null){
      prevNode = current;
      System.out.print(prevNode.getData()+" ");
      current = current.getRight();
    }
    System.out.println();

  }

  private void generateFibonacciNumbers(int num){
    if(fibonacciList.isEmpty()){
      fibonacciList.add(1);
      fibonacciList.add(1);
    }
      int val = (Integer)fibonacciList.get(fibonacciList.size()-1);
      while(val<=num){
        int fibVal = (Integer)(fibonacciList.get(fibonacciList.size()-1))+(Integer)(fibonacciList.get(fibonacciList.size()-2));
        fibonacciList.add(fibVal);
        fibonacciMap.put(fibVal,fibVal);
        val = fibVal;
    }

  }
  private boolean isFibonacciNum(int num){
    generateFibonacciNumbers(num);
    if(fibonacciMap.containsKey(num)){
      return true;
    }
    return false;
  }
}
