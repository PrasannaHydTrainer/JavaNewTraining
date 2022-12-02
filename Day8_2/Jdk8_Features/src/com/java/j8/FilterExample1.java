package com.java.j8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExample1 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();

        for(int i=1;i<10;i++) {
            list.add(i);
        }

        List<Integer> numbersList= list.stream().filter(i -> i%2==0).collect(Collectors.toList());
        System.out.println(numbersList);
    }
}
