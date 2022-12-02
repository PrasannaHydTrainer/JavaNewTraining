package com.java.j8;

interface ITest {
    Employ showEmploy(int empno, String name, double basic);
}
class Employ {
    int empno;
    String name;
    double basic;

    Employ(int empno, String name, double basic) {
        this.empno=empno;
        this.name=name;
        this.basic=basic;
    }

    @Override
    public String toString() {
        return "Employ{" +
                "empno=" + empno +
                ", name='" + name + '\'' +
                ", basic=" + basic +
                '}';
    }
}

public class MethodConEx {
    public static void main(String[] args) {
        ITest obj = Employ::new;
        Employ e =obj.showEmploy(1,"Himanshu",99423);
        System.out.println(e);
    }
}
