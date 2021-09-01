package com.jojoidu.book.springboot.user;

import com.jojoidu.book.springboot.domain.post.Posts;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface UserRepository extends JpaRepository<User,Long> { // <Entity 클래스, PK 타입>

    Optional<User> findByEmail(String email); // Oauth 로그인으로 반환되는 값 중 email을 통해 이미 생성된 사용자인지 처음인지 판단하는 메소드
}
