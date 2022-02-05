package com.training;

public class MessageReader
{
  private String message;

  public void initialize()
  {
    System.out.println("This is the first method which executes while initializing this class's bean: " +
                       this.getClass().getCanonicalName());
  }

  public void setMessage(String message)
  {
    this.message = message;
  }

  public void readMessage()
  {
    System.out.println("Message is :" + message);
  }
}
