package com.myla.tree;

import com.myla.bean.Node;

/**
 * Created by venkateswara.km on 20/01/16.
 */
public class BST {

  private Node root = null;

  public Node addNode(int data){
    Node temp = new Node(data);
    if(root == null){
      root = temp;
    }else{
      insert(root,temp);
    }
    return root;
  }

  private void insert(Node root, Node child){
    if(root!=null){

      if(child.getData()>root.getData()){
        if(root.getRight()==null){
          root.setRight(child);
        }else{
          insert(root.getRight(),child);
        }
      }else if(child.getData()<root.getData()){
        if(root.getLeft()==null){
          root.setLeft(child);
        }else{
          insert(root.getLeft(),child);
        }
      }
    }
  }
}
