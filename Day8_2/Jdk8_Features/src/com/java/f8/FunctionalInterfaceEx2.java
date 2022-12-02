package com.java.f8;

@FunctionalInterface
interface IDemo {
    void sayHello();
    int hashCode();
    String toString();
    boolean equals(Object ob);
}
public class FunctionalInterfaceEx2 {
    public static void main(String[] args) {
        IDemo obj = () -> {
            System.out.println("New Program Functional Interface...");
        };
        obj.sayHello();
    }
}
