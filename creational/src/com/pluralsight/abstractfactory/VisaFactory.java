package com.pluralsight.abstractfactory;

import com.pluralsight.abstractfactory.card.CreditCard;
import com.pluralsight.abstractfactory.card.VisaBlackCreditCard;
import com.pluralsight.abstractfactory.card.VisaGoldCreditCard;
// Concrete Factory
public class VisaFactory extends CreditCardFactory {
    @Override
    public CreditCard getCreditCard(CardType cardType) {
        switch (cardType){
            case GOLD:
                return new VisaGoldCreditCard();
            case PLATINUM:
                return new VisaBlackCreditCard();
            default:
                throw new IllegalArgumentException("Invalid cardType");
        }
    }
}
