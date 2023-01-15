
package org.example;

public class Calculator {
    public static double calculatingDiscount(double purchaseAmount, double discountAmount) {
        // purchaseAmount - сумма покупки
        // discountAmount - размер скидки
        double d= purchaseAmount*(discountAmount/100); ;
        double discSum=purchaseAmount-d;;

        return discSum; // Метод должен возвращать сумму покупки со скидкой

    }
}
