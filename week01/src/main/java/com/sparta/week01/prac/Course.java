package com.sparta.week01.prac;

public class Course {
    // title, tutor, days 가 Course 라는 맥락 아래에서 의도가 분명히 드러나죠!
    private String title;
    private String tutor;
    private int days;

    //기본 생성자
    public Course(){

    }

    //생성자
    //생성자 하나라도 더 추가하고 기본 생성자 안쓰면, 없는거로 친다.
    public Course(String title,String tutor,int days){
        this.title=title;
        this.tutor=tutor;
        this.days=days;
    }

    // Getter
    public String getTitle() {
        return this.title;
    }
    // Getter
    public String getTutor() {
        return this.tutor;
    }
    // Getter
    public int getDays() {
        return this.days;
    }

    // Setter
    public void setTitle(String title) {
        this.title = title;
    }
    // Setter
    public void setTutor(String tutor) {
        this.tutor = tutor;
    }
    // Setter
    public void setDays(int days) {
        this.days = days;
    }

}

/*
    클래스명과 파일명은 일치해야 한다.



*/