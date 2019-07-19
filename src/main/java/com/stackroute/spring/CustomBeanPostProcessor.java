package com.stackroute.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;


public class CustomBeanPostProcessor implements BeanPostProcessor
{
  //implementing beanpostprocessor(interacting with bean)
    @Override
    public Object postProcessBeforeInitialization(Object bean,String beanName) throws BeansException {
        return null;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean,String beanName) throws BeansException {
        return null;
    }

}
