package com.test.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.logging.LogManager;

/**
 * Created by venkateswara.km on 27/01/16.
 */
public class HelloWorld {

  private static final Logger logger = LoggerFactory.getLogger(HelloWorld.class);
  public static void main(String[] args){
    System.out.println("Welcome to Git World");
    logger.error("Hello World Error");
  }
}
