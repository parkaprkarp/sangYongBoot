package com.jojoidu.book.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @Configuration + @EnableAutoConfiguration + @ComponentScan 을 합친 것
// 스프링 Bean 읽기, 생성 자동 설정
// 프로젝트 최상단
@SpringBootApplication
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class, args); // 내장 WAS
    }
}
