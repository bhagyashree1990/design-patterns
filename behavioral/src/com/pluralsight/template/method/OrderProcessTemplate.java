package com.pluralsight.template.method;

abstract class OrderProcessTemplate {
    protected boolean isGift;
    protected abstract void doSelect();
    protected abstract void doPayment();
    protected abstract void doDelivery();

    public final void giftWrap() {
        System.out.println("Gift Wrap");
    }

    public final void processOrder() {
        doSelect();
        doPayment();
        if(isGift)
            giftWrap();
        doDelivery();
    }
}
