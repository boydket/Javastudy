package com.example.demo;

import com.example.demo.mathexam.MathExam;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

        assertThat(math.exam120818(100000)).isEqualTo(95000);   //10만원 이상
        assertThat(math.exam120818(300000)).isEqualTo(270000);  //30만원 이상
        assertThat(math.exam120818(500000)).isEqualTo(400000);  //50만원 이상
    }
}
