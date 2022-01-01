package com.example.sparta.homework02.controller;

import com.example.sparta.homework02.domain.Person;
import com.example.sparta.homework02.domain.PersonRepository;
import com.example.sparta.homework02.domain.PersonRequestDto;
import com.example.sparta.homework02.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor //멤버변수 중 final로 선언된 애들 생성자 만들어준다.
@RestController
public class PersonController { //요청/응답을 처리한다.
    //멤버 변수 선언
    private final PersonRepository personRepository;
    private final PersonService personService;
    //final은 항상 필요함을 의미

    @PostMapping("/api/persons")
    public Person createPerson(@RequestBody PersonRequestDto requestDto){
        //어노테이션(@RequestBody)이 있어야 requestDto에 body가 전달된다.
        Person person = new Person(requestDto);
        //requestDto가 Body로 받아오고 person에 저장한다.
        return personRepository.save(person);
        //JPA를 이용하여 DB에 저장하고, 결과 반환
    }

    //조회
    @GetMapping("/api/persons")
    public List<Person> getPerson() {return personRepository.findAll(); }

    //수정
    @PutMapping("/api/person/{id}")
    public Long updatePerson(@PathVariable Long id,@RequestBody PersonRequestDto requestDto){
        return personService.update(id,requestDto);
    }
    //@PathVariable,@RequestBody가 있어야 스프링이 정확히 매칭해준다.

    @DeleteMapping("/api/person/{id}")
    public Long deletePerson(@PathVariable Long id){
        personRepository.deleteById(id);
        return id;
    }
}
