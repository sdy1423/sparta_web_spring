package com.sparta.week01.prac;

public class Tutor {
    private String name;
    private String bio;

    //Getter
    public String getName(){
        return this.name;
    }

    //Setter
    public void setName(String name){
        this.name = name;
    }

    public String getBio(){
        return this.bio;
    }
    public void setBio(String bio){
        this.bio=bio;
    }

    //기본 생성자
    public Tutor(){

    }

    //생성자
    public Tutor(String name,String bio){
        this.bio=bio;
        this.name=name;
    }

}
