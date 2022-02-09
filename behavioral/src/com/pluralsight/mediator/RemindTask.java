package com.pluralsight.mediator;

import java.awt.*;
import java.util.TimerTask;

public class RemindTask extends TimerTask {
    public static int count = 1;
    private Toolkit toolkit;

    public RemindTask() {
        toolkit = Toolkit.getDefaultToolkit();
    }

    @Override
    public void run() {
        toolkit.beep();
        System.out.println("Invoked "+count++ +" times");
    }
}
