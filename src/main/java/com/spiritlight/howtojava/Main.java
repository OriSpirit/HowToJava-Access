package com.spiritlight.howtojava;

public class Main {
    public static String publicString = "This can be accessed everywhere!";
    static String packagePrivateString = "This can be accessed within this specific package!";


    // Declares your main class, everything starts here!
    public static void main(String[] args) { // args like program execution args ie java -jar thisProgram.jar args0 args1..
        Class nonStaticClass = new Class(); // Create a Class instance for us, StaticClass doesn't require this.
        System.out.println("Calling from the non static class and do some math...");
        nonStaticClass.run();
        System.out.println("I'm not static, 8+16 is " + nonStaticClass.add(8, 16));
        System.out.println("Now trying this with a static one!");
        StaticClass.run();
        System.out.println("I'm static, 6+9 is " + StaticClass.add(6, 9));
        System.out.println("I'm now trying to get some super secret values from privateVariables!");
        getPrivate();
        otherClass.getPublicString();
        otherClass.getPPString();
    }

    private static void getPrivate() {
        System.out.println(privateVariables.getPrivateString());
        System.out.println("Now I cannot modify it directly, but (look at the code)");
        privateVariables.setPrivateString("A brand new modified string");
        System.out.println(privateVariables.getPrivateString());
        System.out.println("tada!");
    }
}
