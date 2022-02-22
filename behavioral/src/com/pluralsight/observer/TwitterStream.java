package com.pluralsight.observer;

import java.util.Observable;
// Concrete Subject
public class TwitterStream extends Observable {
    public void someoneTweeted() {
        setChanged();
        notifyObservers();
    }
}
