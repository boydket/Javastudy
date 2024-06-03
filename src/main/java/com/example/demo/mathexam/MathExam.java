package com.example.demo.mathexam;

public class MathExam {

    public int subTest001(int n1, int n2) throws Exception{
        System.out.println("subtest");
        if(n1<-50000 || n1 > 50000) {
            throw new Exception("num1 값은 -50000보다 작거나, num1 값은 50000 보다 큽니다...");
        }
        if ( n2 < -50000 || n2 > 50000) {
            throw new RuntimeException("num2 값은 -50000보다 작거나, num2 값은 50000보다 큽니다.");
        }
        return n1-n2;
    }

    public int mathTest002(int n1, int n2) throws Exception {
        System.out.println("mathtest002");
        if (n1<0 || n1>100) {
            throw new Exception("num1 값은 0~100 사이의 값이어야 합니다.");
        }
        if (n2<0 || n2>100) {
            throw new Exception("num2 값은 0~100 사이의 값이어야 합니다.");
        }
        return n1*n2;
    }

    public int mathTest004(int n1, int n2) throws Exception {
        System.out.println("mathtest004");
        if (n1<0 || n1>10000) {
            throw new RuntimeException("num1 값은 0~10000 사이의 값이어야 합니다.");
        }
        if (n2<0 || n2>10000) {
            throw new RuntimeException("num2 값은 0~10000 사이의 값이어야 합니다.");
        }
        if(n1==n2)
            return 1;
        else return -1;
    }

    public double mathTest005(int[] numbers) throws Exception {
        System.out.println("mathtest005");
        if ( numbers == null ) {
            throw new Exception("numbers는 null이 아니어야 합니다.");
        }
        if (numbers.length < 1 || numbers.length > 100 ) {
            throw new Exception("numbers 배열 크기는 1~100개 사이어야 합니다.");
        }
        int sum=0;
        for (int i=0; i<numbers.length; i++) {
            sum+=numbers[i];
        }
        double ans=sum/(double)numbers.length;

        return ans;
    }
}
