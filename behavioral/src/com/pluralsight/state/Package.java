package com.pluralsight.state;

public class Package {
    private PackageState state;

    public Package() {
        this.state = new OrderedState();
    }

    public void previousState() {
        state.previous(this);
    }

    public void nextState() {
        state.next(this);
    }

    public void printStatus() {
        state.printStatus();
    }

    public PackageState getState() {
        return state;
    }

    public void setState(PackageState state) {
        this.state = state;
    }
}
