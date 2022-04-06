package com.pluralsight.state;

public class ShippedState implements PackageState{
    @Override
    public void next(Package pkg) {
        pkg.setState(new ReceivedState());
    }

    @Override
    public void previous(Package pkg) {
        pkg.setState(new OrderedState());
    }

    @Override
    public void printStatus() {
        System.out.println("Package shipped, not received yet");
    }
}
