package com.sahibinden.sahibinden;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


class SahibindenApplicationTests {
    Calculator underTest= new Calculator();

    @Test
    void itShouldAddTwoNumbers() {
        //  given المعطى
        int numberOne=20;
        int numberTwo=30;

        // When متى
         int result=underTest.add(numberOne,numberTwo);

         //then
        int expected=50;
         assertThat(result).isEqualTo(expected);
    }

    class Calculator{
        int add(int a,int b){return a+b;}
    }

}
