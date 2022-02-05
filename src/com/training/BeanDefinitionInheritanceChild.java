package com.training;

public class BeanDefinitionInheritanceChild
{
  private boolean hasParent;
  private String beanName;
  private boolean supportInheritance;

  public boolean isHasParent()
  {
    return hasParent;
  }

  public void setHasParent(boolean hasParent)
  {
    this.hasParent = hasParent;
  }

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
