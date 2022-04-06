package com.pluralsight.state;

public class OrderedState implements PackageState{
    @Override
    public void next(Package pkg) {
        pkg.setState(new ShippedState());
    }

    @Override
    public void previous(Package pkg) {
        System.out.println("Package is in root state");
    }

    @Override
    public void printStatus() {
        System.out.println("Package ordered, not delivered yet");
    }
}
