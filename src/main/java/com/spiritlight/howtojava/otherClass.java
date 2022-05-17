package com.spiritlight.howtojava;

public class otherClass {
    public static void getPublicString() {
        System.out.println("I got the public String from main: " + Main.publicString);
    }

    public static void getPPString() {
        System.out.println("I got the package private String from main: " + Main.packagePrivateString);
        System.out.println("I can't get this if I was in other packages!");
    }
}
