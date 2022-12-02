package com.java.j8;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class StreamExample3 {
    public static void main(String[] args) {
        List<Product> list=new ArrayList<>();
        list.add(new Product(1,"Samsung A5",17000f));
        list.add(new Product(3,"Iphone 6S",65000f));
        list.add(new Product(2,"Sony Xperia",25000f));
        list.add(new Product(4,"Nokia Lumia",15000f));
        list.add(new Product(5,"Redmi4 ",26000f));
        list.add(new Product(6,"Lenevo Vibe",19000f));
        // Display all products whose name starts with 'S'

        list.stream().filter((s) -> s.name.startsWith("S")).forEach(System.out::println);

        // Display all products in Upper Case
        list.stream().map(s -> s.name.toUpperCase()).forEach(System.out::println);
    // Display in sorted and uppper case

    }
}
