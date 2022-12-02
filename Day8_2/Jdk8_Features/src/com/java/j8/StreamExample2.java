package com.java.j8;

import java.util.ArrayList;
import java.util.List;

public class StreamExample2 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();

        for(int i=1;i<10;i++) {
            list.add(i);
        }

        Integer[] evenNumbersArr = list.stream().filter(i -> i%2==0).toArray(Integer[]::new);
        for(int i : evenNumbersArr) {
            System.out.println(i);
        }
    }
}
