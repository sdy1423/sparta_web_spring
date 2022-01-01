package com.example.sparta.homework02.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Long> {
}
/*
    Repository는 SQL 역할 대신함
    인터페이스는 클래스에서 멤버가 빠진 메소드 모음집
 */