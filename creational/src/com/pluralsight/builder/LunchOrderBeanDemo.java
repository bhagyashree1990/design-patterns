package com.pluralsight.builder;

public class LunchOrderBeanDemo {
    public static void main(String[] args) {
        LunchOrderBean.Builder builder = new LunchOrderBean.Builder();
        builder.bread("Wheat").condiments("Lettuce").dressing("Mustard").meat("Ham");

        LunchOrderBean lunchOrderBean = builder.build();

        System.out.println(lunchOrderBean.getBread());
        System.out.println(lunchOrderBean.getCondiments());
        System.out.println(lunchOrderBean.getDressing());
        System.out.println(lunchOrderBean.getMeat());
    }
}
