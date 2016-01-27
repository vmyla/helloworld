package com.myla.bean;

import lombok.Data;

/**
 * Created by venkateswara.km on 25/12/15.
 */
@Data
public class Node {

  private int data;
  private Node left = null;
  private Node right = null;

  private int height;
  public Node(int val){
    this.data = val;
  }
}
