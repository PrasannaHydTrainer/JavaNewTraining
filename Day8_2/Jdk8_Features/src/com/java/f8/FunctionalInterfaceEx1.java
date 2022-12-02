package com.java.f8;

@FunctionalInterface
interface IHello {
    void sayHello();
}

public class FunctionalInterfaceEx1 {
    public static void main(String[] args) {
        IHello hello = () -> {
            System.out.println("Welcome to Functional Interface...");
        };
        hello.sayHello();
    }
}
