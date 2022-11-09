package com.alfredzhong.spring.demo;

import org.springframework.stereotype.Service;

@Service
public class AzSpringDemoService {
    public void sayHi(String name) {
        System.out.println("hi, " + name);
    }
}
