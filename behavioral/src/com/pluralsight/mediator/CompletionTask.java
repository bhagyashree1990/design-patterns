package com.pluralsight.mediator;

import java.util.Timer;
import java.util.TimerTask;

public class CompletionTask extends TimerTask {
    private Timer timer;

    public CompletionTask(Timer timer) {
        this.timer = timer;
    }

    @Override
    public void run() {
        System.out.println("Time Up!");
        timer.cancel();
    }
}
