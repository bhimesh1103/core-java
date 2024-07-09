package com.tnsif.Static;

public class Employee {
	int eid;
	String ename;
	static String company="tnsif";
	
	Employee(int r, String n){
		eid=r;
		ename=n;
	}
	void display() {
		System.out.println(eid+" "+ename+"  "+company);
	}

}
