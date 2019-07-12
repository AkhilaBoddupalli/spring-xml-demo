package com.stackroute.spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemo implements InitializingBean, DisposableBean {

        public void Init() throws Exception {
            System.out.println("Custom init");
        }

        public void customDestroy () throws Exception {
            System.out.println("Custom destroy");
        }


    @Override
    public void destroy() throws Exception {
        System.out.println("Default destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Default initialization");


    }
}
