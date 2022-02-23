package org.students;

import org.college.College;

public class Studends extends College{
	public void studentName() {
		System.out.println("Gopinath");
		// TODO Auto-generated method stub

	}
	public void studentDept() {
		System.out.println("MECH");
		// TODO Auto-generated method stub

	}
	public void studentId() {
		System.out.println("1324");
		// TODO Auto-generated method stub

	}
	public static void main(String[] args) {
		Studends details=new Studends();
		details.collegeName();
		details.collegeCode();
		details.collegeRank();
		details.department();
		details.studentName();
		details.studentDept();
		details.studentId();
	}

}
