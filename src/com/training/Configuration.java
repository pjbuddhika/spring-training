package com.training;

import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration
{
  @Bean
  public JavaConfiguration getJavaConfiguration()
  {
    return new JavaConfiguration();
  }
}
