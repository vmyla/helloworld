package com.myla.tree;

import com.myla.bean.Node;

/**
 * Created by venkateswara.km on 20/01/16.
 */
public class TestBstMerge {

  public static void main(String[] args){
    BST bst = new BST();
    Node root1 = bst.addNode(2);
    bst.addNode(1);
    bst.addNode(5);
    bst.addNode(9);
    bst.addNode(7);


    BST bst1 = new BST();
    Node root2 = bst1.addNode(4);
    bst1.addNode(1);
    bst1.addNode(2);
    bst1.addNode(15);
    bst1.addNode(13);
    bst1.addNode(14);
    bst1.addNode(16);

    MergeGivenBsts mergeGivenBsts = new MergeGivenBsts(root1,root2);
    mergeGivenBsts.mergeBsts();
  }


}
