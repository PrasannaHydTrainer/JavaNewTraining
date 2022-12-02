package com.java.f8;

@FunctionalInterface
interface IMethodRef1 {
    void show();
}

class MethodRefDemo1 {
    void display() {
        System.out.println("From Display Method...");
    }
}
public class MethodRef1 {
    public static void main(String[] args) {
        MethodRefDemo1 obj = new MethodRefDemo1();
        IMethodRef1 m1 = obj::display;
        m1.show();
    }
}
