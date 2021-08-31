package com.jojoidu.book.springboot.domain.post;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

// MyBatis 에 DAO 역할
public interface PostsRepository extends JpaRepository<Posts,Long> { // <Entity 클래스, PK 타입>

    @Query("SELECT p FROM Posts p ORDER BY p.id DESC")
    List<Posts> findAllDesc();
}
