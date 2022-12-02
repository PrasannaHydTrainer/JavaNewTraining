package com.java.j8;

public class Emp {
    int empno;
    String name;
    double basic;

    public Emp(int empno, String name, double basic) {
        this.empno = empno;
        this.name = name;
        this.basic = basic;
    }

    public Emp() {}

    @Override
    public String toString() {
        return "Emp{" +
                "empno=" + empno +
                ", name='" + name + '\'' +
                ", basic=" + basic +
                '}';
    }
}
