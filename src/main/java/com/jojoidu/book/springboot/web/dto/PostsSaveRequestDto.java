package com.jojoidu.book.springboot.web.dto;

import com.jojoidu.book.springboot.domain.post.Posts;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostsSaveRequestDto {

    private String title;
    private String content;
    private String author;

    @Builder // Controller DTO
    public PostsSaveRequestDto(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public Posts toEntity() { // 엔티티 DTO // Request/Response 하면 X
        return Posts.builder() // 빌더 패턴 어떤 필드에 어떤 값을 넣어주는지 명확히 눈으로 확인할 수 있다!
                .title(title)
                .content(content)
                .author(author)
                .build();
    }
}
