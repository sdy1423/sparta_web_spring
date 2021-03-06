package com.example.sparta.homework02.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor //기본생성자
@Entity
public class Person extends Timestamped{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)//컬럼 값이고 반드시 존재해야 한다.
    private String name;

    @Column(nullable = false)
    private int age;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String job;


    public Person(String name,int age,String address,String job){
        this.name=name;
        this.age = age;
        this.address=address;
        this.job = job;
    }

    public Person(PersonRequestDto requestDto){
        this.name=requestDto.getName();
        this.age=requestDto.getAge();
        this.address=requestDto.getAddress();
        this.job=requestDto.getJob();
    }

    public void update(PersonRequestDto requestDto){
        this.name=requestDto.getName();
        this.age=requestDto.getAge();
        this.address=requestDto.getAddress();
        this.job=requestDto.getJob();
    }
}
