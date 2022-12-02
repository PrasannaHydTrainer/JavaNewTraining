package com.java.j8;

import java.util.ArrayList;
import java.util.List;

public class ProductInfo {
    public static void main(String[] args) {
        List<Product> list=new ArrayList<>();
        list.add(new Product(1,"Samsung A5",17000f));
        list.add(new Product(3,"Iphone 6S",65000f));
        list.add(new Product(2,"Sony Xperia",25000f));
        list.add(new Product(4,"Nokia Lumia",15000f));
        list.add(new Product(5,"Redmi4 ",26000f));
        list.add(new Product(6,"Lenevo Vibe",19000f));
        System.out.println("Total Number Records are  ");
        long count = list.stream().count();
        System.out.println("Total Records are   " +count);
        Product productMax = list.stream().max((p1,p2) -> p1.price > p2.price ? 1 : -1).get();
        System.out.println("Max Price is  " +productMax.price);
        Product productMin = list.stream().min((p1,p2) -> p1.price > p2.price ? 1 : -1).get();
        System.out.println("Min Price is   " +productMin.price);

    }
}
