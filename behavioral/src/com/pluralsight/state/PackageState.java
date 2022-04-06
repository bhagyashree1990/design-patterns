package com.pluralsight.state;

public interface PackageState {
    void next(Package pkg);
    void previous(Package pkg);
    void printStatus();
}
