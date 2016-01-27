package com.myla.tree;

import com.myla.bean.Node;

import java.util.Stack;

/**
 * Created by venkateswara.km on 20/01/16.
 */
public class MergeGivenBsts {

  private Stack<Node> stack1;
  private Stack<Node> stack2;
  private Node root1,root2;

  public MergeGivenBsts(Node root1, Node root2){
    this.root1 = root1;
    this.root2 = root2;
    this.stack1 = new Stack<Node>();
    this.stack2 = new Stack<Node>();
  }

  private void pushLeftElements(Node root,Stack<Node> stack){
    while(root!=null){
      stack.push(root);
      root = root.getLeft();
    }
  }

  private void printElements(Stack<Node> stack){
    while (stack!=null&&!stack.isEmpty()){
      Node data = stack.pop();
      System.out.print(data.getData()+" ");
      if(data.getRight()!=null){
        pushLeftElements(data.getRight(),stack);
      }
    }
  }

  public void mergeBsts(){

    pushLeftElements(this.root1,stack1);
    pushLeftElements(this.root2,stack2);

    while(!stack1.isEmpty()&&!stack2.isEmpty()){
      Node data1 = stack1.pop();
      Node data2 = stack2.pop();
      if(data1.getData()==data2.getData()){
        System.out.print(data1.getData()+" "+data2.getData()+" ");
        if(data1.getRight()!=null){
          pushLeftElements(data1.getRight(),stack1);
        }
        if(data2.getRight()!=null){
          pushLeftElements(data2.getRight(),stack2);
        }
      }else if(data1.getData()<data2.getData()){
        System.out.print(data1.getData()+" ");
        if(data1.getRight()!=null){
          pushLeftElements(data1.getRight(),stack1);
        }
        stack2.push(data2);
      }else if(data2.getData()<data1.getData()){
        System.out.print(data2.getData()+" ");
        if(data2.getRight()!=null){
          pushLeftElements(data2.getRight(),stack2);
        }
        stack1.push(data1);
      }
    }

    if(!stack1.isEmpty()){

      printElements(stack1);
    }
    if(!stack2.isEmpty()){
      printElements(stack2);
    }
  }

  public void inorderTraversal(Node root){
    if(root!=null){
      inorderTraversal(root.getLeft());
      System.out.print(root.getData()+" ");
      inorderTraversal(root.getRight());

    }
  }
}
