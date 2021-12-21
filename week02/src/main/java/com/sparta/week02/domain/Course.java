package com.sparta.week02.domain;

import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor // 기본생성자를 대신 생성해줍니다. (Argument = parameter가 없다는 뜻이니까 기본 생성자 대신 생성하는거)
@Entity // 그냥 클래스가 아니라 테이블임을 나타냅니다.
public class Course {

    @Id // ID 값, Primary Key로 사용하겠다는 뜻입니다. 식별자!
    @GeneratedValue(strategy = GenerationType.AUTO) // 자동 증가 명령입니다. = Auto Increment
    private Long id;

    @Column(nullable = false) // 컬럼 값이고 반드시 값이 존재해야 함을 나타냅니다.
    private String title;

    @Column(nullable = false)
    private String tutor;

    //id는 데이터베이스에서 쓰는거니까 getter 설정 안한다.

    public String getTitle() {
        return this.title;
    }

    public String getTutor() {
        return this.tutor;
    }
    //setter는 repository 에서 해주니까 필요 없는것.

    public Course(String title, String tutor) {
        this.title = title;
        this.tutor = tutor;
    }
}