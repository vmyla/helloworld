package com.myla.tree;

import com.myla.bean.Node;

/**
 * Created by venkateswara.km on 20/01/16.
 * Replace the current node data with sum of all the higher nodes
 */
public class ReplaceWithHigherNodeSum {

  public static void main(String[] args){
    //insert nodes 2,1,5,9,7

    BST bst = new BST();
    Node root = bst.addNode(2);
    bst.addNode(1);
    bst.addNode(5);
    bst.addNode(9);
    bst.addNode(7);
    ReplaceWithHigherNodeSum obj = new ReplaceWithHigherNodeSum();
    System.out.println("BST before data replacement");
    obj.inorderTraversal(root);
    System.out.println();
    obj.replaceDataWithHigherNodeSum(root,0);
    System.out.println("BST after data replacement");
    obj.inorderTraversal(root);
  }

  public void inorderTraversal(Node root){
    if(root!=null){
      inorderTraversal(root.getLeft());
      System.out.print(root.getData()+" ");
      inorderTraversal(root.getRight());

    }
  }
  public int replaceDataWithHigherNodeSum(Node root, int sumVal){
    int sum = sumVal;
    if(root==null){
      sum = sumVal;
    }else{
      sum = replaceDataWithHigherNodeSum(root.getRight(), sumVal);
      int data = root.getData();
      root.setData(sum);
      sum = replaceDataWithHigherNodeSum(root.getLeft(),sum+data);
    }
    return sum;
  }

}
