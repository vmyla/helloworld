package com.myla.tree;

import com.myla.bean.Node;
import com.myla.util.ListUtil;

/**
 * Created by venkateswara.km on 26/12/15.
 */
public class AVLTreeTest {


  public static void main(String[] args){

    int elements[] = new int[]{3,2,1,4,5,6,7,8,9};
    //construct tree, while constructing balance the tree as well
    Node root = null;
    for(int i=0;i<elements.length;i++){
      Node temp = ListUtil.addNodeBST(root,elements[i]);
      if(root == null){
        root = temp;
      }
    }
    System.out.println(root!=null?root.getHeight():0);
    //print height
  }

  public Node balance(Node root, int direction){

    return null;
  }
}
