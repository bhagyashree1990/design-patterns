package com.pluralsight.template.method;

public class TemplateMethodDemo {
    public static void main(String[] args) {
        OrderProcessTemplate onlineOrder = new OnlineOrder(true);
        onlineOrder.processOrder();

        OrderProcessTemplate storeOrder = new StoreOrder(false);
        storeOrder.processOrder();
    }
}
