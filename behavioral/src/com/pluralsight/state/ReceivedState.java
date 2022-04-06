package com.pluralsight.state;

public class ReceivedState implements PackageState{
    @Override
    public void next(Package pkg) {
        System.out.println("Package is already received by client");
    }

    @Override
    public void previous(Package pkg) {
        pkg.setState(new ShippedState());
    }

    @Override
    public void printStatus() {
        System.out.println("Package delivered");
    }
}
