package com.pluralsight.template.method;

public class StoreOrder extends OrderProcessTemplate{
    public StoreOrder(boolean isGift) {
        this.isGift = isGift;
    }

    @Override
    protected void doSelect() {
        System.out.println("Customer chooses item from shelf");
    }

    @Override
    protected void doPayment() {
        System.out.println("Pays using cash or POS");
    }

    @Override
    protected void doDelivery() {
        System.out.println("Item delivered at the counter");
    }
}
