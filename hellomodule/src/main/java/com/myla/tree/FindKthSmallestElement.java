package com.myla.tree;

import com.myla.bean.Node;

/**
 * Created by venkateswara.km on 20/01/16.
 */
public class FindKthSmallestElement {

  public static void main(String[] args){
    BST bst = new BST();
    Node root1 = bst.addNode(2);
    bst.addNode(1);
    bst.addNode(5);
    bst.addNode(9);
    bst.addNode(7);

    FindKthSmallestElement obj = new FindKthSmallestElement();
    obj.findKthSmallestElement(root1,6,0);
  }

  public int findKthSmallestElement(Node root, int elementIndex,int currentIndex){
    int index = currentIndex;
    if(root==null){
      return index;
    }
    if(root.getLeft()!=null){
      index = findKthSmallestElement(root.getLeft(),elementIndex,currentIndex);
    }
    if(index == elementIndex-1 && root!=null){
      System.out.println(root.getData());
    }
    index++;
    if(root.getRight()!=null){
      index = findKthSmallestElement(root.getRight(),elementIndex,index);
    }
    return index;
  }
}
