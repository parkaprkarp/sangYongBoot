package com.jojoidu.book.springboot.domain.post;

import org.springframework.data.jpa.repository.JpaRepository;

// MyBatis 에 DAO 역할
public interface PostsRepository extends JpaRepository<Posts,Long> { // <Entity 클래스, PK 타입>

    
}
