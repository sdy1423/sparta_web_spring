package com.example.sparta.homework02.domain;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass //상속했을 때, 컬럼으로 인식
@EntityListeners(AuditingEntityListener.class) //생성/수정 시간 자동으로 반영하도록
public abstract class Timestamped {
//추상 클래스는 상속으로만 써야 한다.

    @CreatedDate //생성일자
    private LocalDateTime createdAt;

    @LastModifiedDate //마지막 수정일자
    private LocalDateTime modifiedAt;
}
/*
    EntityListeners : 테이블을 주시하고 있는다.
    AuditingEntityListener : 수정될때마다 시간 업데이트
    MappedSuperclass : 상속했을 때 멤버변수들을 컬럼으로 인식
 */
