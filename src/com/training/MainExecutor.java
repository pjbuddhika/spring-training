package com.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainExecutor
{
  public static void main(String args[])
  {
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");

    //messageReader bean has a singleton scope -stateless bean
    System.out.println("=========SINGLETON BEAN ===================");
    MessageReader reader = (MessageReader) applicationContext.getBean("messageReader");
    reader.readMessage();
    MessageReader newReader = (MessageReader) applicationContext.getBean("messageReader");
    newReader.readMessage();
    System.out.println("Both represents the same bean : " + reader + " : " + newReader);

    //prototypeScopeTester bean has a prototype scope -stateful bean(each call new object created)
    System.out.println("=========PROTOTYPE BEAN ===================");
    PrototypeScopeTester firstPrototype = (PrototypeScopeTester) applicationContext.getBean("prototypeScopeTester");
    PrototypeScopeTester secondPrototype = (PrototypeScopeTester) applicationContext.getBean("prototypeScopeTester");
    System.out.println("New bean created each time : " + firstPrototype + " : " + secondPrototype);

    //bean Definition inheritance - parent
    System.out.println("===============bean Definition inheritance - parent===============");
    BeanDefinitionInheritanceParent parent =
      (BeanDefinitionInheritanceParent) applicationContext.getBean("beanDefinitionInheritanceParent");
    System.out.println("parent.getBeanName() : " + parent.getBeanName());
    System.out.println(" parent.isSupportInheritance() : " + parent.isSupportInheritance());

    //bean Definition inheritance - child
    System.out.println("===============bean Definition inheritance - child===============");
    BeanDefinitionInheritanceChild child =
      (BeanDefinitionInheritanceChild) applicationContext.getBean("beanDefinitionInheritanceChild");
    System.out.println("child.getBeanName() : " + child.getBeanName());
    System.out.println(" child.isSupportInheritance() : " + child.isSupportInheritance());
    System.out.println("child.isHasParent() : " + child.isHasParent());

    //dependency Injection through Constructor
    System.out.println("dependency Injection through Constructor");
    DependencyInjectionTester diTester =
      (DependencyInjectionTester) applicationContext.getBean("dependencyInjectionTester");

    //Annotation based injection
    AnnotationTester tester = (AnnotationTester) applicationContext.getBean("annotationTester");
    tester.show();

    //java based configuration
    ApplicationContext context = new AnnotationConfigApplicationContext(Configuration.class);
    JavaConfiguration javaConfiguration = context.getBean(JavaConfiguration.class);
  }
}
