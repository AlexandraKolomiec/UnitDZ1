
package org.example;

public class Calculator {
    public static double calculatingDiscount(double purchaseAmount, double discountAmount) {
        double discSum;
        // purchaseAmount - сумма покупки
        // discountAmount - размер скидки

        if ((purchaseAmount <= 0) || (discountAmount <= 0) || (discountAmount >= 100)) {
            throw new ArithmeticException("Введите верное значение");
        }
        else {
            double d= purchaseAmount*(discountAmount/100); ;
            discSum=purchaseAmount-d;
        }

        // способ 2 , не смогла разобраться
//        if (400 != Calculator.calculatingDiscount(500, 20)) {
//            throw new ArithmeticException("Ошибка в методе");
//        }
//        try {
//            Calculator.calculatingDiscount(500,0);
//        } catch (ArithmeticException e) {
//            if (!e.getMessage().equals("Cкидка равна 0")) {
//                throw new AssertionError("Ошибка в методе");
//            }
//        }
//        try {
//            Calculator.calculatingDiscount(500,-20);
//        } catch (ArithmeticException e) {
//            if (!e.getMessage().equals("Отрицательное значение скидки")) {
//                throw new AssertionError("Ошибка в методе");
//            }
//        }
//        try {
//            Calculator.calculatingDiscount(0,20);
//        } catch (ArithmeticException e) {
//            if (!e.getMessage().equals("Сумма должна быть больше 0")) {
//                throw new AssertionError("Ошибка в методе");
//            }
//        }
//        try {
//            Calculator.calculatingDiscount(-500,20);
//        } catch (ArithmeticException e) {
//            if (!e.getMessage().equals("Отрицательное значение суммы")) {
//                throw new AssertionError("Ошибка в методе");
//            }
//        }
//        try {
//            Calculator.calculatingDiscount(500.0,20.0);
//        } catch (ArithmeticException e) {
//            if (!e.getMessage().equals("Дробное значение суммы и/или скидки")) {
//                throw new AssertionError("Ошибка в методе");
//            }
//        }
//        try {
//            Calculator.calculatingDiscount(500,120);
//        } catch (ArithmeticException e) {
//            if (!e.getMessage().equals("Отрицательное значение суммы")) {
//                throw new AssertionError("Ошибка в методе");
//            }
//        }
        return discSum; // Метод должен возвращать сумму покупки со скидкой

    }
}
