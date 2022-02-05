package com.training;

public class DependencyInjectionTester
{
  private MessageReader messageReader;

  public DependencyInjectionTester(MessageReader messageReader)
  {
    System.out.println("Injecting messageReader dependency");
    this.messageReader = messageReader;
  }
}
