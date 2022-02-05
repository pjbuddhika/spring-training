package com.training;

public class PrototypeScopeTester
{
  private void init()
  {
    System.out.println("This is the first method which executes while initializing this class's bean : " + this.getClass().getCanonicalName());
  }
}
