package com.jojoidu.book.springboot.web;

import com.jojoidu.book.springboot.service.posts.PostsService;
import com.jojoidu.book.springboot.web.dto.PostsSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor // final 생성 lombok
@RestController

public class PostsApiController {

    private final PostsService postsService;

    @PostMapping("/api/v1/posts")
    public long save(@RequestBody PostsSaveRequestDto requestDto){

        return postsService.save(requestDto);
    }
}
