package com.pluralsight.abstractfactory;

import com.pluralsight.abstractfactory.card.AmexGoldCreditCard;
import com.pluralsight.abstractfactory.card.AmexPlatinumCreditCard;
import com.pluralsight.abstractfactory.card.CreditCard;
// Concrete Factory
public class AmexFactory extends CreditCardFactory {
    @Override
    public CreditCard getCreditCard(CardType cardType) {
        switch (cardType){
            case GOLD:
                return new AmexGoldCreditCard();
            case PLATINUM:
                return new AmexPlatinumCreditCard();
            default:
                throw new IllegalArgumentException("Invalid cardType");
        }
    }
}
