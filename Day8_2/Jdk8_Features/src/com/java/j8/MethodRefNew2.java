package com.java.j8;

interface IHello {
    void sayHello();
}

class DemoExample {
    public static void sayMe() {
        System.out.println("This is Example of Static methods of reference");
    }
}

public class MethodRefNew2 {
    public static void main(String[] args) {
        IHello hello = DemoExample::sayMe;
        hello.sayHello();
    }
}
