package com.spiritlight.howtojava;

public class privateVariables {
    // Makes a getter and setter in case you accidentally set a wrong variable
    public static String getPrivateString() {
        return privateString;
    }

    public static void setPrivateString(String privateString) {
        privateVariables.privateString = privateString;
    }

    private static String privateString = "This can be accessed only in this program!";
}
