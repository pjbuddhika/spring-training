package com.training;

public class BeanDefinitionInheritanceParent
{
  private String beanName;
  private boolean supportInheritance;

  public String getBeanName()
  {
    return beanName;
  }

  public void setBeanName(String beanName)
  {
    this.beanName = beanName;
  }

  public boolean isSupportInheritance()
  {
    return supportInheritance;
  }

  public void setSupportInheritance(boolean supportInheritance)
  {
    this.supportInheritance = supportInheritance;
  }
}
