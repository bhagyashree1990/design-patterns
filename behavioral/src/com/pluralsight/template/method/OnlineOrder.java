package com.pluralsight.template.method;

public class OnlineOrder extends OrderProcessTemplate{
    public OnlineOrder(boolean isGift) {
        this.isGift = isGift;
    }

    @Override
    protected void doSelect() {
        System.out.println("Item added to cart");
    }

    @Override
    protected void doPayment() {
        System.out.println("Payment through Net banking or Card");
    }

    @Override
    protected void doDelivery() {
        System.out.println("Item ready to ship to the delivery address");
    }
}
