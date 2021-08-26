package com.jojoidu.book.springboot.web;

import com.jojoidu.book.springboot.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// 컨트롤러를 JSON을 반환하는 컨트롤러로 만듬
// 스프링에 ResponseBody 같은 개념
// https://velog.io/@gillog/Spring-Annotation-%EC%A0%95%EB%A6%AC#service 스프링 어노테이션 정리
@RestController
public class HelloController {

    @GetMapping("/hello") // get요청
    public String Hello () {
        return "hello";
    }

    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto (@RequestParam("name") String name, @RequestParam("amount") int amount){
        return new HelloResponseDto(name,amount);
    }

}
