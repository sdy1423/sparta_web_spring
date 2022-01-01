package com.sparta.week02.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter //Getter작성안해도 lombok이 작성해준다.
@NoArgsConstructor // 기본생성자를 대신 생성해줍니다. (Argument = parameter가 없다는 뜻이니까 기본 생성자 대신 생성하는거)
@Entity // 그냥 클래스가 아니라 테이블임을 나타냅니다.
public class Course extends Timestamped {

    @Id // ID 값, Primary Key로 사용하겠다는 뜻입니다. 식별자!
    @GeneratedValue(strategy = GenerationType.AUTO) // 자동 증가 명령입니다. = Auto Increment
    private Long id;

    @Column(nullable = false) // 컬럼 값이고 반드시 값이 존재해야 함을 나타냅니다.
    private String title;

    @Column(nullable = false)
    private String tutor;

    public Course(CourseRequestDto requestDto){
        this.title= requestDto.getTitle();
        this.tutor= requestDto.getTutor();
    }

    public Course(String title, String tutor) {
        this.title = title;
        this.tutor = tutor;
    }

    //[2-7] Update 추가
    public void update(CourseRequestDto requestDto) {
        this.title = requestDto.getTitle();
        this.tutor = requestDto.getTutor();
    }


}