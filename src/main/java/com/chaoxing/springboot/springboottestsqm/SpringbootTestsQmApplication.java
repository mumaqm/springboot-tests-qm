package com.chaoxing.springboot.springboottestsqm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = {"com.chaoxing"})
public class SpringbootTestsQmApplication {

    public static void main(String[] args) {
        if(args != null && args.length > 0){
            System.out.println(args[0]);
        }
        SpringApplication.run(SpringbootTestsQmApplication.class, args);
    }

}
