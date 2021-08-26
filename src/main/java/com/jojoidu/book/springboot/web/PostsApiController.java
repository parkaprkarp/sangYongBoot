package com.jojoidu.book.springboot.web;

import com.jojoidu.book.springboot.service.posts.PostsService;
import com.jojoidu.book.springboot.web.dto.PostsResponseDto;
import com.jojoidu.book.springboot.web.dto.PostsSaveRequestDto;
import com.jojoidu.book.springboot.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor // final 생성 lombok
@RestController
public class PostsApiController {

    private final PostsService postsService;

    @PostMapping("/api/v1/posts") // 저장
    public long save(@RequestBody PostsSaveRequestDto requestDto){

        return postsService.save(requestDto);
    }

    @PutMapping("/api/v1/posts/{id}") // 수정
    public long update(@PathVariable Long id, @RequestBody PostsUpdateRequestDto requestDto){
        //PathVariable = requestParameter // RequestBody = response 왔을때 json이나 xml 형식을 바로 바디값에 파싱
        return postsService.update(id, requestDto);
    }

    @GetMapping("/api/v1/posts/{id}") // 아이디 찾기
    public PostsResponseDto findById(@PathVariable Long id){
        return postsService.findById(id);
    }
}
