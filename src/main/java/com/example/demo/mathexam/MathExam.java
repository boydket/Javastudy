package com.example.demo.mathexam;
import java.util.Scanner;

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

    //짝수 홀수 개수
    public int[] exam120824(int[] num_list) throws Exception {
        if (num_list.length<=0 || num_list.length>100) {
            throw new Exception("num_list의 길이는 0이거나 100보다 클 수 없습니다.");
        }
        for (int i=0; i<num_list.length; i++) {
            if(num_list[i]<0 || num_list[i]>1000) {
                throw new Exception("num_list의 원소의 값은 0보다 작거나 1000보다 클 수 없습니다.");
            }
        }

        int[] answer = new int[]{};

        int odd=0;
        int even=0;

        for(int i=0; i<num_list.length; i++) {
            if(num_list[i]%2==1) {
                odd++;
            }
            else even++;
        }
        answer = new int[2];

        answer[0]=even;
        answer[1]=odd;

        return answer;
    }


    //가장 큰 수 찾기
    public int[] exam120899(int[] array) throws Exception {
        int[] answer={};

        if(array.length<1 || array.length>100) {
            throw new Exception("array의 길이는 1보다 작거나 100보다 커서는 안됩니다.");
        }
        for(int i=0; i<array.length; i++) {
            if(array[i]<0 || array[i]>1000) {
                throw new Exception("array의 원소의 값은 0보다 작거나 1000보다 커서는 안됩니다.");
            }
        }

        for(int i=0; i<array.length-1; i++)
            for(int j=i+1; j<array.length; j++) {
                if(array[i]==array[j])
                    throw new Exception("array 배열에 중복된 숫자가 있어서는 안됩니다.");
            }

        int index=0;
        int num=array[0];

        for(int i=0; i<array.length; i++) {
            if(num<array[i]) {
                num=array[i];
                index=i;
            }
        }

        answer=new int[2];
        answer[0]=num;
        answer[1]=index;

        return answer;
    }

    public int codeup1045() {
        Scanner sc = new Scanner(System.in);

        return 0;
    }

    public int codeup1173(int hour, int minute) throws Exception{
        if (hour<0 || hour>23) {
            throw new Exception("시는 0보다 작거나 23보다 클 수 없습니다.");
        }
        if (minute<0 || minute>59) {
            throw new Exception("분은 0보다 작거나 59보다 클 수 없습니다.");
        }

        if (minute>=30) {
            minute-=30;
        }
        else if(minute<30) {
            minute=60-minute;
            if(hour==0) {
                hour=24;
            }
            else {
                hour--;
            }

        }

        int answer=hour*100+minute;
        return answer;
    }

    public int codeup1180(int n) throws Exception {
        if (n<1 || n>99) {
            throw new Exception("n은 1보다 작거나 99보다 클 수 없습니다.");
        }

        int ans=0;
        ans=(n/10+(n%10)*10)*2;

        ans%=100;

        System.out.println(ans);
        if(ans<=50) {
            System.out.println("GOOD");
        }
        else {
            System.out.println("OH MY GOD");
        }

        return 0;
    }

    public double codeup1205(double a, double b) throws Exception {

        double max;

        max = a+b;
        if (max<a-b) {
            max = a-b;
        }
        if (max<b-a) {
            max = b-a;
        }
        if (max<a*b) {
            max=a*b;
        }
        if (max<a/b) {
            max=a/b;
        }
        if (max<b/a) {
            max=b/a;
        }
        if (max<Math.pow(a,b)) {
            max=Math.pow(a,b);
        }
        if (max<Math.pow(b,a)) {
            max=Math.pow(b,a);
        }
        System.out.println(String.format("%.6f", max));

        return 0.1;
    }
    
    public void codeup1226() throws Exception {
        Scanner input = new Scanner(System.in);
        String first = input.nextLine();
        String second = input.nextLine();

        String[] arr1 = getStrings(first);

        String[] arr2 = first.split(" ");
        int[] n2 = new int[arr1.length];

        for(int i=0; i<n2.length; i++) {
            n2[i] = Integer.parseInt(arr2[i]);
        }

    }

    private static String[] getStrings(String first) {
        String[] arr1 = first.split(" ");
        int[] n1 = new int[arr1.length];

        for(int i=0; i<n1.length; i++) {
            n1[i] = Integer.parseInt(arr1[i]);
        }
        return arr1;
    }

    public void codeup3015(int n, int m, Student[] sts) throws Exception {
        if (n<3 || n>100) {
            throw new Exception("n은 3보다 작거나 100보다 클 수 없습니다.");
        }
        if (m<1 || m>n) {
            throw new Exception("m은 1보다 작거나 n보다 클 수 없습니다.");
        }

        for (int i=0; i<n-1; i++) {
            for (int j=i; j<n; j++) {
                if (sts[i].getScore() > sts[j].getScore()) {
                    Student tmp = sts[j];
                    sts[j] = sts[i];
                    sts[i] = tmp;
                }
            }
        }

        for (int i=0; i<m; i++) {
            System.out.println(sts[i].getName());
        }
    }

    public void memberservice() {

    }

    public void codeup1602(String num) throws Exception {
        Scanner sc = new Scanner(System.in);

        boolean m=false;
        boolean d=false;
        int n1;
        double n2;

        for(int i=0; i<num.length(); i++) {
            char ch=num.charAt(i);
            if(ch=='-') {
                m=true;
            }
            else if(ch=='.') {
                d=true;
            }
        }

        if(d) {
            n2=Double.parseDouble(num);
            if(n2<0) {
                n2=-n2;
            }
            System.out.println(n2);
        }
        else {
            n1=Integer.parseInt(num);
            if(n1<0) {
                n1=-n1;
            }
            System.out.println(n1);
        }
    }

    public int addRecrusive(int n) {
        if (n<=0) {
            return 0;
        }
        else {
            return n+addRecrusive(n-1);
        }
    }
    public int codeup1905(int n) throws Exception {
        if (n<1 || n>100) {
            throw new Exception("n은 1보다 작거나 100보다 클 수 없습니다.");
        }
        return addRecrusive(n);

    }

    public int codeup1916(int n) throws Exception {
        if (n<1 || n>200) {
            throw new Exception("n은 1보다 작거나 200보다 클 수 없습니다.");
        }


    }
}
