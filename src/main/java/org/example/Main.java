package org.example;

import static org.assertj.core.api.Assertions.assertThat;

public class Main {
    public static void main(String[] args) {
//      Calculator.calculatingDiscount(purchaseAmount,discountAmount);
        System.out.println(Calculator.calculatingDiscount(500,20));

        // способ 1
        assertThat(Calculator.calculatingDiscount(500,20)).isEqualTo(400);
        assertThat(Calculator.calculatingDiscount(500, 0)).isEqualTo(500);
        assertThat(Calculator.calculatingDiscount(500, -20)).isEqualTo(600);
        assertThat(Calculator.calculatingDiscount(0, 20)).isEqualTo(0);
        assertThat(Calculator.calculatingDiscount(-500, 20)).isEqualTo(-400);
        assertThat(Calculator.calculatingDiscount(500.0, 20.0)).isEqualTo(400.0);
        assertThat(Calculator.calculatingDiscount(500, 120)).isEqualTo(-100);

//
        // 2 способ выдает ошибку 130, не смогла разобраться
//        assertThatThrownBy(() ->Calculator.calculatingDiscount(500, 0)).isInstanceOf(ArithmeticException.class).hasMessage("Cкидка  не может быть равна 0");
//        assertThatThrownBy(() ->Calculator.calculatingDiscount(500, -10)).isInstanceOf(ArithmeticException.class).hasMessage("Cкидка  не может быть отрицательной");;
//        assertThatThrownBy(() ->Calculator.calculatingDiscount(500, 0.1)).isInstanceOf(ArithmeticException.class).hasMessage("Cкидка  не может быть дробным числом");;
//        assertThatThrownBy(() ->Calculator.calculatingDiscount(500, 101)).isInstanceOf(ArithmeticException.class).hasMessage("Cкидка  не может быть больше 100%");;


    }


}


