package com.example.demo.mathexam;

public class Phone {
    private String model;
    private int makeYear;

    // model 의 Getter
    public String getModel() {
        return this.model;
    }

    // model의 Setter
    public void setModel(String model) {
        this.model = model;
    }

    //makeYear의 Getter
    public int getMakeYear() {
        if (this.makeYear <= 2020) {
            //유호하지 않은 값은 유효한 값으로 변화하여 리턴한다.
        }
        return this.makeYear;
    }

    //makeYearModel의 Setter
    public void setMakeYear(int makeYear) {
        if (this.makeYear <= 2020) {
            //유효하지 않은 값은 저장하지 않는다.
        }
        this.makeYear = makeYear;
    }
}
