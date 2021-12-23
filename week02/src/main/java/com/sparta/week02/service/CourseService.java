package com.sparta.week02.service;

import com.sparta.week02.domain.Course;
import com.sparta.week02.domain.CourseRepository;
import com.sparta.week02.domain.CourseRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service // 스프링에게 이 클래스는 서비스임을 명시
public class CourseService {

    // final: 서비스에게 꼭 필요한 녀석임을 명시 => 변형 불가
    private final CourseRepository courseRepository;

    // 생성자를 통해, Service 클래스를 만들 때 꼭 Repository를 넣어주도록
    // 스프링에게 알려줌
    /*
        //RequiredArgsConstructor 때문에 더 이상 필요 없어졌다.
        public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }*/

    @Transactional // SQL 쿼리가 일어나야 함을 스프링에게 알려줌 => 자동으로 DB에 적용된다.
    public Long update(Long id, CourseRequestDto requestDto) {
        Course course1 = courseRepository.findById(id).orElseThrow(
                //courseRepository 객체 생성 안했는데 쓸 수 있다. 이건 위에서 알아서 생성해서 멤버변수화 하도록 했기 때문이다.
                () -> new IllegalArgumentException("해당 아이디가 존재하지 않습니다.")
        );
        course1.update(requestDto);
        return course1.getId(); //Update를 진행한 id를 리턴
    }
}