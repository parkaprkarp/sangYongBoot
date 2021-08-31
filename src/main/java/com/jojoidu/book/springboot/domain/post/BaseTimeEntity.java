package com.jojoidu.book.springboot.domain.post;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass // JPA 엔티티 클래스들이 필드를 컬럼으로 인식하도록
@EntityListeners(AuditingEntityListener.class) // BaseTimeEnity 클래스에
public class BaseTimeEntity {

    @CreatedDate // 엔티티 생성될때 날짜시간자동저장 // INSERT용
    private LocalDateTime createDate;

    @LastModifiedDate // 엔티티 수정될때 날짜시간자동저장 // UPDATE용
    private LocalDateTime modifiedDate;

}
