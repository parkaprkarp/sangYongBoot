package com.jojoidu.book.springboot.web.dto;

import com.jojoidu.book.springboot.domain.post.Posts;
import lombok.Getter;


@Getter
public class PostsResponseDto {

    private Long id;
    private String title;
    private String content;
    private String author;

    public PostsResponseDto(Posts entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.author = entity.getAuthor();
    }
}