package com.vish.tutoriel.thisexample;

public class Producer {
    int a = 10;

    public Producer() {
        new Consumer(this);
    }

    public void show() {
        System.out.println("Value of a " + a);
    }

    public static void main(String s[]) {
        new Producer();
    }
}