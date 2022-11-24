package com.java.sup;

class Employ {
	
	int empno;
	String name;
	double basic;

	public Employ(int empno, String name, double basic) {
		this.empno = empno;
		this.name = name;
		this.basic = basic;
	}

	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
	}
}

class Jenil extends Employ {

	public Jenil(int empno, String name, double basic) {
		super(empno, name, basic);
	}
	
}

class Anusha extends Employ {

	public Anusha(int empno, String name, double basic) {
		super(empno, name, basic);
		// TODO Auto-generated constructor stub
	}
	
}
public class SupCon {
	public static void main(String[] args) {
//		Employ obj = new Anusha(1, "Anusha", 83244);
//		System.out.println(obj);
//		
//		Employ obj1 = new Jenil(3, "Jenil", 84231);
//		System.out.println(obj1);
		
		Employ[] employArray = new Employ[] {
				new Anusha(1, "Anusha", 83244),
				new Jenil(3, "Jenil", 84231)
		};
		for (Employ emp : employArray) {
			System.out.println(emp);
		}
	}
}
