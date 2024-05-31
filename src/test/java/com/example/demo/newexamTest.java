package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class newexamTest {
    @Test
    public void subtract001() throws Exception{
        // given    테스트하기 위한 준비 동작
        int num1=2;
        int num2=3;
        int expected=-1;

        // when  // 테스트를 실시
        int actual=subTest001(num1,num2);

        // then  // 실제값과 기대값을 비교해서 테스트한다.
        assertThat(actual).isEqualTo(expected);
    }

    int subTest001(int n1, int n2) throws Exception{
        if(n1<-50000 || n1 > 50000) {
            throw new Exception("num1 값은 -50000보다 작거나, num1 값은 50000 보다 큽니다...");
        }
        return n1-n2;
    }
}
