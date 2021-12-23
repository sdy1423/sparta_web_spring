package com.sparta.week02.domain;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass // 상속했을 때, 컬럼으로 인식하게 합니다.
@EntityListeners(AuditingEntityListener.class) // 생성/수정 시간을 자동으로 반영하도록 설정
public abstract class Timestamped {
/*
    abstract : 추상
    직접 구현 안된다. 상속으로만 써야 한다.
 */

    @CreatedDate // 생성일자임을 나타냅니다.
    private LocalDateTime createdAt;

    @LastModifiedDate // 마지막 수정일자임을 나타냅니다.
    private LocalDateTime modifiedAt;
}

/*
    LocalDateTime : 시간 나타내는 자료형중 하나

    EntityListeners : Entity는 course같은 테이블을 의미함. 그걸 주시하고 있어라.
    AuditingEntityListener : 수정될때마다 시간 업데이트
    MappedSuperclass : 상속했을 때 멤버변수들을 컬럼으로 인식해라.


 */