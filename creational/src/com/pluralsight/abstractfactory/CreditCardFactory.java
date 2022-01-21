package com.pluralsight.abstractfactory;

import com.pluralsight.abstractfactory.card.CreditCard;

//Abstract Factory
public abstract class CreditCardFactory {
    public static CreditCardFactory getCreditCardFactory(int creditScore) {
        return creditScore > 650 ? new AmexFactory() : new VisaFactory();
    }

    public abstract CreditCard getCreditCard(CardType cardType);
}
