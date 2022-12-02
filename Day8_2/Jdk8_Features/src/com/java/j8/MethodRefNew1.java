package com.java.j8;

@FunctionalInterface
interface ICalc {
    int calc(int a, int b);
}

class Calc1 {
    public int sum(int a,int b) {
        return a+b;
    }

    public int sub(int a, int b) {
        return a-b;
    }

    public int mult(int a, int b) {
        return a*b;
    }
}
public class MethodRefNew1 {
    public static void main(String[] args) {
        Calc1 obj = new Calc1();
        ICalc c1 = obj::sum;
        System.out.println("Sum is  " +c1.calc(12,5));

        ICalc c2 = obj::sub;
        System.out.println("Sub is   " +c2.calc(12, 5));

        ICalc c3 = obj::mult;
        System.out.println("Mult is  " +c3.calc(12,5));
    }
}
