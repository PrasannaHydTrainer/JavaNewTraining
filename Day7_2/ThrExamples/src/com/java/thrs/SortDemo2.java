package com.java.thrs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortDemo2 {

	public static void main(String[] args) {
		List<Employ> list=new ArrayList<Employ>();
		
		list.add(new Employ(1,"Prasanna",58344)); 
		list.add(new Employ(3,"Darshan",53222));
		list.add(new Employ(4,"Vidya",62133)); 
		list.add(new Employ(5,"Chaithra",62334));
		
		Collections.sort(list,(e1,e2)->{
			return e1.getName().compareTo(e2.getName());
		});
		
		System.out.println("List Data is ");
		for(Employ e : list){
			System.out.println(e);
		}
		
		Collections.sort(list, (e1, e2) -> {
			return (int) (e1.getBasic() - e2.getBasic());
		});

		System.out.println("Sort By Salary Wise  ");
		for (Employ employ : list) {
			System.out.println(employ);
		}
	}
}
