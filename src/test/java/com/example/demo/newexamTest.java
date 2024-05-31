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
        assertThat(-1).isEqualTo(math.subTest001(2,3));

        //Exception 예외가 발생해야지만 정상 동작으로 인식한다.
       assertThatThrownBy(() -> math.subTest001(70000, 7))
               .isInstanceOf(Exception.class);
       //RuntimeException 예외가 발생해야지만 정상 동작으로 인식한다.
        Throwable exception = assertThrows(RuntimeException.class, () -> {
            math.subTest001(2330, 50002);
        });
        System.out.println(exception.toString());

    }

    @Test
    public void multiply001() throws Exception {
        // given
        MathExam math = new MathExam();
        // when
        // then
        assertThat(12).isEqualTo(math.mathTest002(3,4));
        assertThat(513).isEqualTo(math.mathTest002(27,19));
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
        assertThat(1).isEqualTo(math.mathTest004(4,4));
        assertThat(-1).isEqualTo(math.mathTest004(4,5));
        assertThatThrownBy(() -> math.mathTest004(-1,7))
                .isInstanceOf(Exception.class);
        assertThatThrownBy(() -> math.mathTest004(7,50001))
                .isInstanceOf(Exception.class);
    }
}
