package com.jojoidu.book.springboot.service.posts;

import com.jojoidu.book.springboot.domain.post.PostsRepository;
import com.jojoidu.book.springboot.web.dto.PostsSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor

public class PostsService {

    private final PostsRepository postsRepository;

    @Transactional // begin , commit 자동 수행 예외 발생시 rollback 자동 수행
    public long save(PostsSaveRequestDto requestDto){
        return postsRepository.save(requestDto.toEntity()).getId();
    }
}
