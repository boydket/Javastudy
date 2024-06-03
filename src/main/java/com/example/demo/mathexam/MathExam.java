package com.example.demo.mathexam;

public class MathExam {

    public int subTest0001(int n1, int n2) throws Exception{
        System.out.println("subtest");
        if(n1<-50000 || n1 > 50000) {
            throw new Exception("num1 값은 -50000보다 작거나, num1 값은 50000 보다 큽니다...");
        }
        if ( n2 < -50000 || n2 > 50000) {
            throw new RuntimeException("num2 값은 -50000보다 작거나, num2 값은 50000보다 큽니다.");
        }
        return n1-n2;
    }

    public int mathTest002(int n1, int n2) throws Exception { //두 수의 곱
        System.out.println("mathtest002");
        if (n1<0 || n1>100) {
            throw new Exception("num1 값은 0~100 사이의 값이어야 합니다.");
        }
        if (n2<0 || n2>100) {
            throw new Exception("num2 값은 0~100 사이의 값이어야 합니다.");
        }
        return n1*n2;
    }

    public int mathTest004(int n1, int n2) throws Exception { //숫자 비교하기
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

    public double mathTest005(int[] numbers) throws Exception { //배열의 평균값
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

    public int exam120820(int age) throws Exception {   //나이 출력
        if(age<=0 || age>120) {
            throw new Exception("age의 값은 0보다 작거나 같거나 120보다 커서는 안됩니다.");
        }

        int ans=2022-age+1;
        return ans;
    }

    public int exam120829(int angle) throws Exception {
        if (angle<=0) {
            throw new Exception("angle의 값은 0보다 커야 합니다.");
        }
        if (angle>180) {
            throw new Exception("angle의 값은 180보다 커서는 안됩니다.");
        }

        if (angle>0 && angle<90)
            return 1;
        else if (angle==90)
            return 2;
        else if (angle>90 && angle<180)
            return 3;
        else if (angle==180)
            return 4;

        return -1;
    }

    public int exam120831(int n) throws Exception {
        if (n<=0) {
            throw new Exception("n이 0보다 작거나 같아서는 안 됩니다.");
        }
        if (n>1000) {
            throw new Exception("n이 1000보다 커서는 안 됩니다.");
        }

        int sum=0;

        for(int i=2; i<=n; i+=2)
        {
            sum+=i;
        }
        return sum;
    }

    public int[] exam120813(int num) throws Exception {
        if (num<1 || num>100) {
            throw new Exception("n은 1보다 작거나 100보다 커서는 안됩니다.");
        }

        int length=(num+1)/2;
        int[] result = new int[length];
        int index=0;
        for (int i=1; i<=num; i+=2) {
            result[index++] = i;
        }
        return result;
    }
}
