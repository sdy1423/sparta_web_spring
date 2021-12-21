package com.sparta.homework01.prac;

public class Person {
    private String name;
    private int age;
    private String address;
    private String job;

    public Person(String name,int age,String address,String job){
        this.name=name;
        this.age = age;
        this.address=address;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getJob() {
        return job;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setJob(String job) {
        this.job = job;
    }

}
