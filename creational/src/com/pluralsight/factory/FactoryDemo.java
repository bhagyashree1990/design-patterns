package com.pluralsight.factory;

import java.util.Calendar;
import java.util.TimeZone;

public class FactoryDemo {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
//        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("EST"));
        System.out.println(calendar);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));


        Website site1 = WebsiteFactory.getWebsite(WebsiteType.BLOG);
        System.out.println(site1.getPages());

        Website site2 = WebsiteFactory.getWebsite(WebsiteType.SHOP);
        System.out.println(site2.getPages());

    }
}
