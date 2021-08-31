package com.jojoidu.book.springboot.domain.post;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest // 통합 테스트를 제공하는 기본적인 스프링 부트 테스트 어노테이션
public class PostsRepositoryTest { // save, findAll 테스트
    @Autowired
    PostsRepository postsRepository;

    @After // 단위 테스트가 끝날때마다 수행되는 메소드 지정 // 메모리관리
    public void cleanup(){
        postsRepository.deleteAll();
    }

    @Test
    public void 게시글저장_불러오기() {
        String title = "테스트 게시글";
        String content = "테스트 본문";
        postsRepository.save(Posts.builder() // posts에 DML insert/update 쿼리 실행 // PK값이 있다면 UPDATE 없으면 INSERT
                .title(title)
                .content(content)
                .author("jojoidu@gmail.com")
                .build()
        );

        List<Posts> postsList = postsRepository.findAll(); // posts 테이블 모든 데이터 조회

        Posts posts = postsList.get(0); // 리스트에 첫번째에 있는 데이터 담고
        assertThat(posts.getTitle()).isEqualTo(title); // 데이터 비교
        assertThat(posts.getContent()).isEqualTo(content);
    }

    @Test
    public void BaseTimeEntity_등록() {
        LocalDateTime now = LocalDateTime.of(2019,6,4,0,0,0);
        postsRepository.save(Posts.builder()
                .title("title")
                .content("content")
                .author("author")
                .build()
        );
     List<Posts> postsList = postsRepository.findAll();

     Posts posts = postsList.get(0);

     System.out.println("111>>>>>>>> createDate" + posts.getCreateDate()+",>>>modifiedDate"+posts.getModifiedDate());

     assertThat(posts.getCreateDate().isAfter(now)); // 엔티티 날짜가 파라미터의 날짜보다 이후인지
     assertThat(posts.getModifiedDate().isAfter(now)); // 엔티티 날짜가 파라미터의 날짜보다 이후인지

    }
}
