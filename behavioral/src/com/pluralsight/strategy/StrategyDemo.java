package com.pluralsight.strategy;

import java.math.BigDecimal;

public class StrategyDemo {
    public static void main(String[] args) {
        Discount discount = Discount.easterDiscount();
        System.out.println(discount.applyDiscount(BigDecimal.valueOf(1000L)));

        Discount discount2 = Discount.christmasDiscount();
        System.out.println(discount2.applyDiscount(BigDecimal.valueOf(1000L)));

        Discount discount3 = Discount.newYearDiscount();
        System.out.println(discount3.applyDiscount(BigDecimal.valueOf(1000L)));
    }
}
