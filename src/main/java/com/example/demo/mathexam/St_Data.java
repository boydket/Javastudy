package com.example.demo.mathexam;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class St_Data {
    long no;
    String name;

    St_Data(long no, String name) {
        this.no=no;
        this.name=name;
    }
}
