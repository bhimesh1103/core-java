package com.tnsif.inheritance;

public class Student extends Citizen {
	private int rollno;
	private String stdname;
	private String clgname;
	public Student() {
		System.out.println("welcome");
	}
	public Student(String name, long adhaarno, String address, long phoneno, int rollno, String stdname,
			String clgname) {
		super(name, adhaarno, address, phoneno);
		this.rollno = rollno;
		this.stdname = stdname;
		this.clgname = clgname;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getStdname() {
		return stdname;
	}
	public void setStdname(String stdname) {
		this.stdname = stdname;
	}
	public String getClgname() {
		return clgname;
	}
	public void setClgname(String clgname) {
		this.clgname = clgname;
	}
	@Override
	public String toString() {
		return super.toString()+"Student [rollno=" + rollno + ", stdname=" + stdname + ", clgname=" + clgname + "]";
	}

}
