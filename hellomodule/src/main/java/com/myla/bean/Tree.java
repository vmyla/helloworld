package com.myla.bean;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by venkateswara.km on 16/12/15.
 */
public class Tree {

  private int value;
  private List<Tree> children = new LinkedList<>();

  public Stream<Tree> flattened(){
    return Stream.concat(Stream.of(this),children.stream().flatMap(Tree :: flattened));
  }
}
