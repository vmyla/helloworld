package com.myla.util;

import com.myla.bean.Node;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by venkateswara.km on 25/12/15.
 */
public class ListUtil {

  public static Node constructList(int elements[]){
    Node startNode = null;
    Node currentNode = null;
    for(int i=0;i<elements.length;i++) {
      Node temp = new Node(elements[i]);
      if(startNode==null){
        startNode = temp;
      }else{
        currentNode.setRight(temp);
      }
      currentNode = temp;
    }
    return startNode;
  }

  public static Node addNode(Node root, int element){
    Node temp = new Node(element);
    if(root == null){
      root = temp;
    }else{
      Node tempRoot = root;
      Node prevNode = null;
      while(tempRoot!=null){
        prevNode = tempRoot;
        tempRoot = tempRoot.getRight();
      }
      prevNode.setRight(temp);
    }
    return temp;
  }

  private static Node balanceTree(Node root, int direction){

    Node temp = null;
    int leftHeight = 0;
    int rightHeight = 0;
    if(root != null){
      leftHeight = root.getLeft()!=null?root.getLeft().getHeight():0;
      rightHeight = root.getRight()!=null?root.getRight().getHeight():0;
      if(leftHeight-rightHeight>=2){
        root.setLeft(balanceTree(root.getLeft(),1));
      }else if(rightHeight-leftHeight>=2){
        root.setRight(balanceTree(root.getRight(),2));
      }
      temp = root;
      Node left = root.getLeft();
      Node right = root.getRight();
      if(left==null){
        temp = root.getRight();
        temp.setLeft(root);
        root.setHeight(0);
      }else if(right == null){
        temp = root.getLeft();
        temp.setRight(root);
        root.setHeight(0);
      }else if(left!=null && right!=null){
        temp = root;
        if(left.getHeight()>right.getHeight()){
          Node temp1 = root.getLeft();
          root.setLeft(temp1.getRight());
          leftHeight = root.getLeft()!=null?root.getLeft().getHeight():0;
          rightHeight = root.getRight()!=null?root.getRight().getHeight():0;
          root.setHeight(leftHeight>rightHeight?leftHeight+1:rightHeight+1);
          temp1.setRight(temp);
          temp = temp1;
        }else if(right.getHeight()>left.getHeight()){
          Node temp1 = root.getRight();
          root.setRight(temp1.getLeft());
          leftHeight = root.getLeft()!=null?root.getLeft().getHeight():0;
          rightHeight = root.getRight()!=null?root.getRight().getHeight():0;
          root.setHeight(leftHeight>rightHeight?leftHeight+1:rightHeight+1);
          temp1.setLeft(temp);
          //temp1.setHeight(temp1.getLeft().getHeight()>temp1.getRight().getHeight()?temp1.getLeft().getHeight()+1:temp1.getRight().getHeight()+1);
          temp = temp1;
        }
        /*leftHeight = temp.getLeft()!=null?temp.getLeft().getHeight():0;
        rightHeight = temp.getRight()!=null?temp.getRight().getHeight():0;
        temp.setHeight(leftHeight>rightHeight?leftHeight+1:rightHeight+1);
        temp.setHeight(temp.getLeft().getHeight()>temp.getRight().getHeight()?temp.getLeft().getHeight()+1:temp.getRight().getHeight()+1);*/
      }
      leftHeight = temp.getLeft()!=null?temp.getLeft().getHeight():0;
      rightHeight = temp.getRight()!=null?temp.getRight().getHeight():0;
      temp.setHeight(leftHeight>rightHeight?leftHeight+1:rightHeight+1);

    }
    return temp;
  }
  public static Node addNodeBST(Node root, int val){
    Node temp = new Node(val);
    temp.setHeight(0);
    Node balancedRoot = null;
    if(root == null){
      root = temp;
    }else{
      if(val>root.getData()){
        if(root.getRight()==null){
          root.setRight(temp);
        }else{
          addNodeBST(root.getRight(),val);
        }
      }else if(val<root.getData()){
        if(root.getLeft()==null){
          root.setLeft(temp);
        }else{
          addNodeBST(root.getLeft(),val);
        }
      }
      int leftHieght = root.getLeft()!=null?root.getLeft().getHeight():0;
      int rightHeight = root.getRight()!=null?root.getRight().getHeight():0;
      if(leftHieght-rightHeight>=2){
        balancedRoot = balanceTree(root.getLeft(),1);
        root.setLeft(balancedRoot);
      }else if(rightHeight-leftHieght>=2){
        balancedRoot = balanceTree(root.getRight(),2);
        root.setRight(balancedRoot);
      }
      leftHieght = root.getLeft()!=null?root.getLeft().getHeight():0;
      rightHeight = root.getRight()!=null?root.getRight().getHeight():0;
      root.setHeight(leftHieght>=rightHeight?leftHieght+1:rightHeight+1);
    }
    return temp;
  }
}
