package com.jojoidu.book.springboot.domain.post;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter // 필드내 Getter 메소드 생성
@NoArgsConstructor // 기본생성자 자동 추가
@Entity // JPA 어노테이션 // 테이블과 링크될 클래스
public class Posts {

    @Id // PK
    @GeneratedValue(strategy = GenerationType.IDENTITY) // GenerationType.IDENTITY = Auto_increment
    private Long id;
    
    @Column(length = 500, nullable = false) // 테이블 컬럼 / 길이 500 널 미포함
    private String title;
    
    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;
    
    private String author;
    
    @Builder //
    public Posts(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }
}
