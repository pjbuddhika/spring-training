package com.training;

import org.springframework.beans.factory.annotation.Autowired;

public class AnnotationTester
{
  @Autowired
  private Tester tester;

  public void show()
  {
    tester.showMessage();
  }
}
