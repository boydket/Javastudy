package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class newexamTest {
    @Test
    public void subtract001() throws Exception{
        //Exception 예외가 발생해야지만 정상 동작으로 인식한다.
       assertThatThrownBy(() -> subTest001(70000, 7))
               .isInstanceOf(Exception.class);
       //RuntimeException 예외가 발생해야지만 정상 동작으로 인식한다.
        Throwable exception = assertThrows(RuntimeException.class, () -> {
            subTest001(2330, 50002);
        });
        System.out.println(exception.toString());

    }

    int subTest001(int n1, int n2) throws Exception{
        if(n1<-50000 || n1 > 50000) {
            throw new Exception("num1 값은 -50000보다 작거나, num1 값은 50000 보다 큽니다...");
        }
        if ( n2 < -50000 || n2 > 50000) {
            throw new RuntimeException("num2 값은 -50000보다 작거나, num2 값은 50000보다 큽니다.");
        }
        return n1-n2;
    }
}
