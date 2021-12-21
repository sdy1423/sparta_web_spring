package com.sparta.homework01.controller;

import com.sparta.homework01.prac.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    @GetMapping("/myinfo")
    public Person getPerson(){
        Person person = new Person("송덕용",29,"오산","개발자");
        person.setName("이도윤");
        person.setAge(7);
        person.setAddress("의정부");
        person.setJob("선생님");
        return person;
    }
}
