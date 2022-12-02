package com.java.thrs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortDemo1 {

	public static void main(String[] args) {
		
		List<Product> list=new ArrayList<Product>();  
        list.add(new Product(1,"Samsung A5",17000f));  
        list.add(new Product(3,"Iphone 6S",65000f));  
        list.add(new Product(2,"Sony Xperia",25000f));  
        list.add(new Product(4,"Nokia Lumia",15000f));  
        list.add(new Product(5,"Redmi4 ",26000f));  
        list.add(new Product(6,"Lenevo Vibe",19000f));
        
        
        Collections.sort(list,(p1,p2)->{
        	return p1.name.compareTo(p2.name);
        });
        
        System.out.println("Sorted List is   ");
        for (Product product : list) {
			System.out.println(product);
		}
	}
}
