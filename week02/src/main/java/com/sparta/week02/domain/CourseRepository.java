package com.sparta.week02.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
    /*
        Repository는 SQL역할을 대신 해준다.
        extends는 상속을 의미한다.

        Course : 클래스
        Long : Id의 자료형이 Long이라서

        인터페이스는 클래스에서 멤버가 빠진, 메소드 모음집
     */

}
