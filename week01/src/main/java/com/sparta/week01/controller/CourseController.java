package com.sparta.week01.controller;

import com.sparta.week01.prac.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
    스프링에게 json으로 응답하는 자동응답기라는 것을 알려주자.
    응답하는데 최적화된 빵틀이 된다!

 */
@RestController
public class CourseController {

    @GetMapping("/courses")
    public Course getCourses() {
        Course course = new Course();
        course.setTitle("웹개발의 봄 스프링");
        course.setDays(35);
        course.setTutor("송덕용");
        return course;
    }
    /*
        자바클래스를 Json으로 바꿔서 courses를 돌려주는걸 다 스프링이 해준다.
     */
}
/*
    brouser에서 쳐서 요청하는 것을 get 방식이라고 한다.

 */