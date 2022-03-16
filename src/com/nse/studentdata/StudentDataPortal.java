package com.nse.studentdata;

public class StudentDataPortal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentData data1=new StudentData();
		StudentData data2=new StudentData();
		StudentData data3=new StudentData();
		
		
		
		data1.studentName ="Jack";
		data1.studentRollNo = 1001;
		data1.studentMailId = "jack@gmail.com";
		data1.studentPercentage=45.2;
		StudentData.schoolName ="Global School";
		
		data2.studentName ="Peter";
		data2.studentRollNo = 1002;
		data2.studentMailId = "peter@gmail.com";
		data2.studentPercentage=85.2;
		StudentData.schoolName ="Global School";
		
		data3.studentName ="Mark";
		data3.studentRollNo = 1003;
		data3.studentMailId = "mark@gmail.com";
		data3.studentPercentage=56.5;
		StudentData.schoolName ="Global School";

		
		
		System.out.println("Roll No         :"+data1.studentRollNo);
		System.out.println("Student Name    :"+data1.studentName);
		System.out.println("Student %       :"+data1.studentPercentage);
		System.out.println("Student Mail ID :"+data1.studentMailId);
		System.out.println("School Name     :"+StudentData.schoolName);
		
		System.out.println("\n"+"Roll No         :"+data2.studentRollNo);
		System.out.println("Student Name    :"+data2.studentName);
		System.out.println("Student %       :"+data2.studentPercentage);
		System.out.println("Student Mail ID :"+data2.studentMailId);
		System.out.println("School Name     :"+StudentData.schoolName);
		
		System.out.println("\n"+"Roll No         :"+data3.studentRollNo);
		System.out.println("Student Name    :"+data3.studentName);
		System.out.println("Student %       :"+data3.studentPercentage);
		System.out.println("Student Mail ID :"+data3.studentMailId);
		System.out.println("School Name     :"+StudentData.schoolName);

	}

}
