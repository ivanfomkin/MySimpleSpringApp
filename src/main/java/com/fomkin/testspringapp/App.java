package com.fomkin.testspringapp;

import com.fomkin.testspringapp.config.SpringConfig;
import com.fomkin.testspringapp.service.TestBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        TestBean bean = context.getBean(TestBean.class);

        System.out.println(bean.getName());
    }
}
