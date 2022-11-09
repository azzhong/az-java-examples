package com.alfredzhong.spring.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AzSpringDemoServiceMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AzSpringDemoServiceConfig.class);
        AzSpringDemoService service = context.getBean(AzSpringDemoService.class);
        service.sayHi("My Beautiful World");
        context.close();
    }
}
