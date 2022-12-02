package com.java.thrs;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class OptionalEmploy {

	static List<Employ> employList;

    static {
                employList = new ArrayList<Employ>();
                employList.add(new Employ(1,"Himanshu",85233));
                employList.add(new Employ(2,"Harshita",90833));
                employList.add(new Employ(3,"Ilayarani",91145));
                employList.add(new Employ(4,"Hari Prasad",78667));
    }
    
    public List<Employ> showEmp() {
        return employList;
    }

    public Employ searchEmp(int empno) {
        Employ empFound = null;
        for(Employ e : employList) {
            if (e.getEmpno()==empno) {
                empFound=e;
            }
        }
        return empFound;
    }

    public static void main(String[] args) {
        int empno;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employ No   ");
        empno = sc.nextInt();
        OptionalEmploy obj1 = new OptionalEmploy();
        Optional<Employ> empData = Optional.ofNullable(obj1.searchEmp(empno));
//        System.out.println(empData);
        if (empData.isPresent()) {
            System.out.println(empData);
        } else {
            System.out.println("Record not Found...");
        }

        empData.ifPresent(System.out::println);
        System.out.println(empData.get());

	}
}
