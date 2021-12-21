package com.sparta.week01.prac;

import java.util.ArrayList;
import java.util.List;


public class Prac {

    public static void main(String[] args) {
        String title = "웹개발의 봄, Spring";
        String tutor = "송덕용";
//        Course course = new Course(title,tutor,29);

/*
        course.title = "웹개발의 봄, Spring";
        course.tutor = "송덕용";
*/
        /*
            이와같이 course의 멤버변수를 마음대로 수정 가능한 것은
            public이기 때문이다. 만약 prvate이었으면 수정이 불가하다.
         */

        Course course = new Course();

        System.out.println(course.getTitle());
        System.out.println(course.getTutor());
        System.out.println(course.getDays());

        course.setTitle("웹개발의 봄 스프링");
        course.setTutor("남병관");
        course.setDays(35);

        System.out.println(course.getTitle());
        System.out.println(course.getTutor());
        System.out.println(course.getDays());

/*
        System.out.println(course.title);
        System.out.println(course.tutor);
*/
//private은 밖에서 조회를 할때도 메소드를 이용해야 한다.

    }

}

