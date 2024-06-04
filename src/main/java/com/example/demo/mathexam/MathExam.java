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

    public int exam120585(int[] array, int height) throws Exception{
        int length=array.length;

              //내가 작성한 코드
        if(length<1 || length>100){
            throw new Exception("array의 길이는 1보다 작거나 100보다 커서는 안됩니다.");
        }
        if(height<1 || height>200) {
            throw new Exception("height는 1보다 작거나 200보다 커서는 안됩니다.");
        }
        for(int i=0; i<length; i++) {
            if(array[i]<1 || array[i]>200) {
                throw new Exception("array의 원소의 값은 1보다 작거나 200보다 커서는 안됩니다.");
            }
        }


       // 강사님은 throw new Exception(String.format("height [%d]는 ~~", height); 를 사용했다.
        //서식을 넣으려고?

        int num=0;

        for (int i=0; i<length; i++) {
            if(array[i]>height) {
                num++;
            }
        }
        return num;
    }

    public int exam120818(int price) throws Exception {
        if(price <= 10 || price >= 1000000){
            throw new Exception(String.format("price 값은 10 ~ 1000000 사이의 값이어야 합니다."));
        }
        if(price % 10 != 0){
            throw new Exception(String.format("price 값은 10원 단위로(1의 자리가 0) 주어집니다."));
        }
        double result = 0;
        if(price >= 100000 && price < 300000){
            result = price * 0.95;
        }
        if(price >= 300000 && price < 500000){
            result = price * 0.9;
        }
        if(price >= 500000){
            result = price * 0.8;
        }
        return (int) result;
    }

    //개미 군단
    public int exam120837(int hp) throws Exception {
        if (hp < 0) {
            throw new Exception("hp가 0보다 작아서는 안됩니다.");
        }
        else if (hp > 1000) {
            throw new Exception("hp가 1000보다 커서는 안됩니다.");
        }

        int answer = 0;

        if (hp >= 5) {
            answer += hp/5;
            hp=hp%5;
        }
        if (hp >= 3) {
            answer += hp/3;
            hp = hp%3;
        }
        if (hp < 3) {
            answer += hp/1;

        }

        return answer;
    }

    //가위바위보
    public String exam120839(String rsp) throws Exception {
        String answer = "";
        if (rsp.length()<=0 || rsp.length()>100) {
            throw new Exception("rsp의 길이는 0보다 작거나 100보다 커서는 안됩니다.");
        }

        for(int i=0; i<rsp.length(); i++) {
            char ch=rsp.charAt(i);
            if (ch!='0' && ch!='2' && ch!='5') {
                throw new Exception("rsp는 숫자 0,2,5 로만 이루어져야 합니다.");
            }
        }
        for(int i=0; i<rsp.length(); i++) {
            if (rsp.charAt(i)=='2') {
                answer = answer + "0";
            }
            else if (rsp.charAt(i)=='0') {
                answer = answer + "5";
            }
            else if (rsp.charAt(i)=='5') {
                answer = answer + "2";
            }
        }
        return answer;
    }
}
