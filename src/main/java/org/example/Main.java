package org.example;

import static org.assertj.core.api.Assertions.assertThat;
public class Main {
    public static void main(String[] args) {

        double purchaseAmount=0;
        double discountAmount=0;
        double discSum=0;
        Calculator.calculatingDiscount(purchaseAmount,discountAmount);
        System.out.println(Calculator.calculatingDiscount(500,20));

//        // срабатывает вне зависимости от условий, не могу понять почему
//        if ((purchaseAmount <= 0) || (discountAmount <= 0) || (discountAmount >= 100)) {
//            throw new ArithmeticException("Введите верное значение");
//        }
        // способ 1
        assertThat(Calculator.calculatingDiscount(500,20)).isEqualTo(400);
        assertThat(Calculator.calculatingDiscount(500, 0)).isEqualTo(500);
        assertThat(Calculator.calculatingDiscount(500, -20)).isEqualTo(600);
        assertThat(Calculator.calculatingDiscount(0, 20)).isEqualTo(0);
        assertThat(Calculator.calculatingDiscount(-500, 20)).isEqualTo(-400);
        assertThat(Calculator.calculatingDiscount(500.0, 20.0)).isEqualTo(400.0);
        assertThat(Calculator.calculatingDiscount(500, 120)).isEqualTo(-100);

        // способ 2 Ошибки не выдает и НЕ РАБОТАЕТ, не смогла разобраться
        if (400 != Calculator.calculatingDiscount(500, 20)) {
            throw new ArithmeticException("Ошибка в методе");
        }
        try {
            Calculator.calculatingDiscount(500,0);
        } catch (ArithmeticException e) {
            if (!e.getMessage().equals("Cкидка равна 0")) {
                throw new AssertionError("Ошибка в методе");
            }
        }
        try {
            Calculator.calculatingDiscount(500,-20);
        } catch (ArithmeticException e) {
            if (!e.getMessage().equals("Отрицательное значение скидки")) {
                throw new AssertionError("Ошибка в методе");
            }
        }
        try {
            Calculator.calculatingDiscount(0,20);
        } catch (ArithmeticException e) {
            if (!e.getMessage().equals("Сумма должна быть больше 0")) {
                throw new AssertionError("Ошибка в методе");
            }
        }
        try {
            Calculator.calculatingDiscount(-500,20);
        } catch (ArithmeticException e) {
            if (!e.getMessage().equals("Отрицательное значение суммы")) {
                throw new AssertionError("Ошибка в методе");
            }
        }
        try {
            Calculator.calculatingDiscount(500.0,20.0);
        } catch (ArithmeticException e) {
            if (!e.getMessage().equals("Дробное значение суммы и/или скидки")) {
                throw new AssertionError("Ошибка в методе");
            }
        }
        try {
            Calculator.calculatingDiscount(500,120);
        } catch (ArithmeticException e) {
            if (!e.getMessage().equals("Отрицательное значение суммы")) {
                throw new AssertionError("Ошибка в методе");
            }
        }
        // третий способ выдает ошибку 130, не смогла разобраться
//        assertThatThrownBy(() ->Calculator.calculatingDiscount(500, 0)).isInstanceOf(ArithmeticException.class).hasMessage("Cкидка  не может быть равна 0");
//        assertThatThrownBy(() ->Calculator.calculatingDiscount(500, -10)).isInstanceOf(ArithmeticException.class).hasMessage("Cкидка  не может быть отрицательной");;
//        assertThatThrownBy(() ->Calculator.calculatingDiscount(500, 0.1)).isInstanceOf(ArithmeticException.class).hasMessage("Cкидка  не может быть дробным числом");;
//        assertThatThrownBy(() ->Calculator.calculatingDiscount(500, 101)).isInstanceOf(ArithmeticException.class).hasMessage("Cкидка  не может быть больше 100%");;


    }


}


