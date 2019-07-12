package com.stackroute;

//import com.stackroute.spring.BeanLifeCycleDemo;
import com.stackroute.spring.BeanLifeCycleDemo;
//import com.stackroute.spring.CustomBeanPostProcessor;
import com.stackroute.spring.CustomBeanPostProcessor;
import com.stackroute.spring.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.AliasRegistry;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import java.util.Objects;

public class Main {
    public static void main(String[] args)
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        ((ClassPathXmlApplicationContext) applicationContext).registerShutdownHook();
        BeanLifeCycleDemo beanLifeCycleDemo = (BeanLifeCycleDemo) applicationContext.getBean("beanlifecycle");
        CustomBeanPostProcessor customBeanPostProcessor=(CustomBeanPostProcessor) applicationContext.getBean("custombeanpostprocessor");

        }
}
