package com.example.demo.mathexam;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student extends Object {
    private String name;
    private int score;


    @Override
    public String toString() {
        return String.format("이름 :%s, 점수 :%d", name, score);
    }


}
