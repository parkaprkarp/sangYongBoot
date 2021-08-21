package com.jojoidu.book.springboot.web.dto;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter // 선언된 모든필디의 get 메소드 생성
@RequiredArgsConstructor // final 필드가 포함된 생성자 생성 // final 없으면 안만듬
public class HelloResponseDto {
    
    private final String name;
    private final int amount;

}
