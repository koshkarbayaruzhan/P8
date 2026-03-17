package org.example.decorator;

public class UserReport implements IReport {

    public String generate() {
        return "User Report: [Alice, Bob, Charlie]";
    }
}
