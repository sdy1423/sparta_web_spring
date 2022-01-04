package com.sparta.week03.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//클래스에서 멤버변수가 없는, 메소드만 있는게 interface
public interface MemoRepository extends JpaRepository<Memo, Long> {
    //Jpa에서 미리 작성된 코드들 (find,findall,save등등...)을 메모클래스, id가 long인 녀석이 가져다 쓸 것이다.

    List<Memo> findAllByOrderByModifiedAtDesc(); //쿼리다.
    //findAll By OrderBy ModifiedAt Desc 다 찾아라. modifiedAt 날짜를 기준으로 내림차순으로


}

