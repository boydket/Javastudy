package com.example.demo;

import com.example.demo.mathexam.MathExam;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Scanner;

public class newexamTest {
    @Test
    public void subtract001() throws Exception{
        //given 테스트하기 위한 준비 동작
        MathExam math = new MathExam();

        // when 테스트를 실시

        //then 실제값과 기대값을 비교해서 테스트한다
        //compare004();
        assertThat(math.subTest0001(2,3)).isEqualTo(1);

        //Exception 예외가 발생해야지만 정상 동작으로 인식한다.
      /* assertThatThrownBy(() -> math.subTest001(70000, 7))
               .isInstanceOf(Exception.class);*/
       //RuntimeException 예외가 발생해야지만 정상 동작으로 인식한다.
        Throwable exception = assertThrows(Exception.class, () -> {
            math.subTest0001(2330, 50002);
        });
        System.out.println(exception.toString());

    }

    @Test
    public void multiply001() throws Exception {
        // given
        MathExam math = new MathExam();
        // when
        // then
        assertThat(math.mathTest002(3,4)).isEqualTo(12);
        assertThat(math.mathTest002(27,19)).isEqualTo(513);
        assertThatThrownBy(() -> math.mathTest002(-1, 10))
                .isInstanceOf(Exception.class);
        assertThatThrownBy(() -> math.mathTest002(10, 101))
                .isInstanceOf(Exception.class);
    }

    public void compare004() throws Exception {
        // given
        MathExam math = new MathExam();
        // when
        // then
        assertThat(math.mathTest004(4,4)).isEqualTo(1);
        assertThat(math.mathTest004(4,5)).isEqualTo(-1);
        assertThatThrownBy(() -> math.mathTest004(-1,7))
                .isInstanceOf(Exception.class);
        assertThatThrownBy(() -> math.mathTest004(7,50001))
                .isInstanceOf(Exception.class);
    }

    @Test
    public void average005() throws Exception {
        // given
        MathExam math = new MathExam();
        int[] nums1 = new int[]{2,4,6,8,10};

        // when
        // then
        //assertThat(math.mathTest005(nums1)).isEqualTo(6);
        //assertThat(math.mathTest005(nums1)).isEqualTo(5);
        assertThatThrownBy(() -> math.mathTest005(new int[] {}))
                .isInstanceOf(Exception.class);
        assertThatThrownBy(() -> math.mathTest005(new int[] {0}))
                .isInstanceOf(Exception.class);
        /*Throwable exception = assertThrows(Exception.class, () -> {
            math.mathTest005(new int[] {});
        });
        System.out.println(exception.toString());*/
    }

    @Test
    public void exam120820() throws Exception {
        System.out.println("exam120820");
        MathExam math = new MathExam();
        assertThat(math.exam120820(40)).isEqualTo(1983);
        assertThat(math.exam120820(23)).isEqualTo(2000);

        assertThatThrownBy(() -> math.exam120820(121))
                .isInstanceOf(Exception.class);

        Throwable exception = assertThrows(Exception.class, () -> {
            math.exam120820(-1);
        });
        System.out.println(exception.toString());
    }

    @Test
    public void exam120829() throws Exception {
        System.out.println("120829");
        MathExam math = new MathExam();

        assertThat(math.exam120829(70)).isEqualTo(1);
        assertThat(math.exam120829(91)).isEqualTo(3);
        assertThat(math.exam120829(180)).isEqualTo(4);

        assertThatThrownBy(() -> math.exam120829(-1))
                .isInstanceOf(Exception.class);

        Throwable exception = assertThrows(Exception.class, () -> {
            math.exam120829(181);
        });
        System.out.println(exception.toString());
    }

    @Test
    public void exam120831() throws Exception {
        System.out.println("exam120831");
        MathExam math = new MathExam();

        assertThat(math.exam120831(10)).isEqualTo(30);
        assertThat(math.exam120831(12)).isEqualTo(42);

        assertThatThrownBy(() -> math.exam120831(-1))
                .isInstanceOf(Exception.class);

        Throwable exception = assertThrows(Exception.class, () -> {
            math.exam120831(1001);
        });
        System.out.println(exception.toString());
    }

    @Test
    public void exam120813() throws Exception {
        System.out.println("exam120813");
        MathExam math = new MathExam();

        assertThat(math.exam120813(9)).isEqualTo(new int[] {1,3,5,7,9});
        assertThat(math.exam120813(15)).isEqualTo(new int[] {1,3,5,7,9,11,13,15});

        assertThatThrownBy(() -> math.exam120813(0))
                .isInstanceOf(Exception.class);

        Throwable exception = assertThrows(Exception.class, () -> {
            math.exam120813(101);
        });
        System.out.println(exception.toString());

    }

    @Test
    public void exam120585() throws Exception {
        System.out.println("exam120585");
        MathExam math = new MathExam();

        Throwable ex1 = assertThrows(Exception.class, () -> math.exam120585(new int[] {}, 150));
        System.out.println(ex1.toString());
        Throwable ex2 = assertThrows(Exception.class, () -> math.exam120585(new int[] {150, 201}, 130));
        System.out.println(ex2.toString());
        Throwable ex3 = assertThrows(Exception.class, () -> math.exam120585(new int[] {150, 180}, 201));
        System.out.println(ex3.toString());

        assertThat(math.exam120585(new int[] {149, 188, 192, 178}, 167)).isEqualTo(3);
        assertThat(math.exam120585(new int[] {180, 120, 140}, 190)).isEqualTo(0);
    }

    @Test
    public void exam120818() throws Exception {
        System.out.println("exam120818");
        MathExam math = new MathExam();

        Throwable ex1 = assertThrows(Exception.class, () -> math.exam120818(0));    //price가 10보다 작을 때
        System.out.println(ex1.toString());
        Throwable ex2 = assertThrows(Exception.class, () -> math.exam120818(1000010)); //price가 1000000보다 클 때
        System.out.println(ex2.toString());
        Throwable ex3 = assertThrows(Exception.class, () -> math.exam120818(10001));  //price의 1의 자리가 0이 아닐 때
        System.out.println(ex3.toString());

        assertThat(math.exam120818(150000)).isEqualTo(142500);
        assertThat(math.exam120818(580000)).isEqualTo(464000);
//        assertThat(math.exam120818(500000)).isEqualTo(400000);  //50만원 이상
    }

    @Test
    public void exam120837() throws Exception {
        /*System.out.println("exam120837"); //내가 작성한 테스트
        MathExam math = new MathExam();

        Throwable ex1 = assertThrows(Exception.class, () -> math.exam120837(-1));
        System.out.println(ex1.toString());
        Throwable ex2 = assertThrows(Exception.class, () -> math.exam120837(1001));
        System.out.println(ex2.toString());

        //assertThat(math.exam120837(23)).isEqualTo(6);
        //assertThat(math.exam120837(24)).isEqualTo(7);
        assertThat(math.exam120837(999)).isEqualTo(202);*/

        //조원이 작성한 테스트
        System.out.println("exam120837");
        MathExam math = new MathExam();

        Throwable ex1 = assertThrows(Exception.class, () -> math.exam120837(-1));    //0보다 작을 때
        System.out.println(ex1.toString());
        Throwable ex2 = assertThrows(Exception.class, () -> math.exam120837(1001)); //1000보다 클 때
        System.out.println(ex2.toString());

        assertThat(math.exam120837(23)).isEqualTo(5);
        assertThat(math.exam120837(24)).isEqualTo(6);
        assertThat(math.exam120837(999)).isEqualTo(201);
     }

     @Test
     public void exam120839() throws Exception {
        System.out.println("exam120839test");
        MathExam math = new MathExam();

         Throwable ex1 = assertThrows(Exception.class, () -> math.exam120839(""));    //0보다 작을 때
         System.out.println(ex1.toString());
         Throwable ex2 = assertThrows(Exception.class, () -> math.exam120839("105")); //1000보다 클 때
         System.out.println(ex2.toString());

         assertThat(math.exam120839("2")).isEqualTo("0");
         assertThat(math.exam120839("205")).isEqualTo("052");
     }

     @Test
    public void exam120824() throws Exception {
        System.out.println("exam120824");
        MathExam math = new MathExam();

        Throwable ex1 = assertThrows(Exception.class, () -> math.exam120824(new int[]{}));
        System.out.println(ex1.toString());
        Throwable ex2 = assertThrows(Exception.class, () -> math.exam120824(new int[] {1,2,1001}));
        System.out.println(ex2.toString());

        assertThat(math.exam120824(new int[]{1,2,3,4,5})).isEqualTo(new int[]{2,3});
        assertThat(math.exam120824(new int[]{1,3,5,7})).isEqualTo(new int[]{0,4});
     }

     @Test
    public void exam120899() throws Exception {
        System.out.println("exam120899");
        MathExam math = new MathExam();

        Throwable ex1 = assertThrows(Exception.class, () -> math.exam120899(new int[]{}));
        System.out.println(ex1.toString());
        Throwable ex2 = assertThrows(Exception.class, () -> math.exam120899(new int[]{1,2,3,1001}));
        System.out.println(ex2.toString());
        Throwable ex3 = assertThrows(Exception.class, () -> math.exam120899(new int[]{1,2,3,1,4}));
        System.out.println(ex3.toString());

        assertThat(math.exam120899(new int[]{1,8,3})).isEqualTo(new int[]{8,1});
        assertThat(math.exam120899(new int[]{9,10,11,8})).isEqualTo(new int[]{11,2});
     }

     //진수 출력
     @Test
     public void numberPint() throws Exception {
        int x = 0b1011;
        int y = 0206;
        int z = 0x2A0F;

        int a = 65; //내가 작성한 a,b,c 강사님이 어케햇는진 ㅁㄹ
        int b = 98;
        int c= 67;

        System.out.println(String.format("10진수 : x=%d, y=%d, z=%d\n", x, y, z));
        System.out.println(String.format("8진수 : x=%o, y=%o, z=%o\n", x, y, z));
        System.out.println(String.format("16진수 : x=%x, y=%X, z=%X\n", x, y, z));
        System.out.println(String.format("Char : x=%c, y=%c, z=%c\n", x, y, z));

         System.out.println(String.format("10진수 : a=%d, b=%d, c=%d\n", x, y, z));
         System.out.println(String.format("8진수 : a=%o, b=%o, c=%o\n", x, y, z));
         System.out.println(String.format("16진수 : a=%x, b=%X, c=%X\n", x, y, z));
         System.out.println(String.format("Char : a=%c, b=%c, c=%c\n", x, y, z));
     }

     @Test
    public void myexam() {
//         Scanner sc = new Scanner(System.in);
//
//         String t = sc.next();
//         sc.close();

         String t="2022.1.3";
         String[] ymd = t.split("\\.");

         int year=Integer.parseInt(ymd[0]);
         int month=Integer.parseInt(ymd[1]);
         int day=Integer.parseInt(ymd[2]);

         System.out.println(String.format("%04d.%02d.%02d", year, month, day));
     }

     @Test
    public void codeup1173test() throws Exception {
        MathExam math = new MathExam();

        assertThat(math.codeup1173(11,40)).isEqualTo(1110);

        assertThatThrownBy(() -> math.codeup1173(24,10))
                 .isInstanceOf(Exception.class);

         Throwable ex1 = assertThrows(Exception.class, () -> math.codeup1173(11,60));    //0보다 작을 때
         System.out.println(ex1.toString());
     }

     @Test
    public void codeup1180test() throws Exception {
        MathExam math = new MathExam();

        assertThat(math.codeup1180(90)).isEqualTo(18);

        assertThatThrownBy(() -> math.codeup1180(0))
                .isInstanceOf(Exception.class);

        Throwable ex1 = assertThrows(Exception.class, () -> math.codeup1180(100));
        System.out.println(ex1.toString());
     }

     @Test
    public void codeup3015test() throws Exception {
        MathExam math = new MathExam();

        //Student[] s = new Student[10];
     }

     @Test
    public void codeup1602test() throws Exception {

     }

     @Test
    public void codeup1905test() throws Exception {
        MathExam math = new MathExam();

        assertThat(math.codeup1905(10)).isEqualTo(55);
         assertThatThrownBy(() -> math.codeup1905(0))
                 .isInstanceOf(Exception.class);
         assertThatThrownBy(() -> math.codeup1905(10001))
                 .isInstanceOf(Exception.class);
     }
}
