package com.myla.list;

import com.myla.bean.Node;

/**
 * Created by venkateswara.km on 15/01/16.
 */
public class InsetAtNthPosition {

  public static void main(String[] args){
   Node root =  InsertNth(null,3,0);
    root = InsertNth(root,5,1);
    root = InsertNth(root,4,2);
    root = InsertNth(root,2,4);
    root = InsertNth(root,10,1);
    while(root!=null){
      System.out.print(root.getData());
      root = root.getRight();
    }
  }


  public static Node InsertNth(Node head, int data, int position) {
    // This is a "method-only" submission.
    // You only need to complete this method.

    Node temp = new Node(data);
    temp.setData(data);
    temp.setRight(null);
    Node root = head;

    if(position==0){
      root = temp;
    }else{
      int count = 0;
      Node prev = null;
      while(count<position&&head!=null){
        prev = head;
        head = head.getRight();
        count++;
      }
      if(prev!=null){
        prev.setRight(temp);
        temp.setRight(head);
      }
    }

    return root;
  }

}
