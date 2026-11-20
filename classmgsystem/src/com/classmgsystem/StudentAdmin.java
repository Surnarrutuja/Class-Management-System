package com.classmgsystem;

public class StudentAdmin {

	public static void main(String[] args) {
		Student s=new Student();
		s.sid=111;
		s.sname="Rutuja";
		s.b.bid=76;
		s.b.bname="B";
		s.b.f.fid=101;
		s.b.f.fname="Nilesh";
		s.b.f.c.cid=1111;
		s.b.f.c.cname="java";
		
		System.out.println(s.sid+" "+s.sname+" "+s.b.bid+" "+s.b.bname+" "+s.b.f.fid+" "+s.b.f.fname+" "+s.b.f.c.cid+" "+s.b.f.c.cname);
	}

}
