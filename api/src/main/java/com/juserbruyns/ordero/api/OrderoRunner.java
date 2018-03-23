package com.juserbruyns.ordero.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication (scanBasePackages = {"com.juserbruyns.ordero.api", "com.juserbruyns.ordero.domain", "com.juserbruyns.ordero.services"})
public class OrderoRunner {
    public static void main(String[] args) {
        SpringApplication.run(OrderoRunner.class,args);
    }

}
