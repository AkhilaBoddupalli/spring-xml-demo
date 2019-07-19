package com.stackroute;

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
        Movie movie=(Movie)applicationContext.getBean("movie1");
        Movie movie2=(Movie)applicationContext.getBean("movie2");
        movie.acting();
        movie2.acting();

        //comparing two beans if they are equal
        System.out.println(movie==movie2);


//        Actor actor=(Actor) context.getBean("actor",Actor.class);
//        actor.displayActorInfo();

//        ClassPathResource resource=new ClassPathResource("beans.xml");
//        BeanFactory factory=new XmlBeanFactory(resource);
//        Movie movie1=context.getBean("movie",Movie.class);
//        movie1.acting();
//
//        DefaultListableBeanFactory beanFactory=new DefaultListableBeanFactory();
//        BeanDefinitionReader reader=new XmlBeanDefinitionReader(beanFactory);
//        reader.loadBeanDefinitions(new FileSystemResource("src/main/resources/beans.xml"));
//        Movie movie2=context.getBean("movie",Movie.class);
//        movie2.acting();




        }
}
