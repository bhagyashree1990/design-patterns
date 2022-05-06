package com.pluralsight.strategy;

import java.math.BigDecimal;

public interface Discount {
    BigDecimal applyDiscount(BigDecimal amount);

    static Discount christmasDiscount() {
        return amount -> amount.multiply(BigDecimal.valueOf(0.2));
    }

    static Discount easterDiscount() {
        return amount -> amount.multiply(BigDecimal.valueOf(0.3));
    }

    static Discount newYearDiscount() {
        return amount -> amount.multiply(BigDecimal.valueOf(0.4));
    }
}
