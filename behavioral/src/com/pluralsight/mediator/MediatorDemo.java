package com.pluralsight.mediator;

import java.util.Timer;
import java.util.TimerTask;

public class MediatorDemo {
    public static void main(String[] args) {
        Timer timer = new Timer();  // Mediator
        TimerTask remind = new RemindTask();
        // fixed delay execution
        timer.schedule(remind, 1000, 1000);

        TimerTask completionTask = new CompletionTask(timer);
        timer.schedule(completionTask, 5000);
    }
}

