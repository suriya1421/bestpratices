package com.chainsys.bestPratices.clone;

public class TestCloning 
{	
	public static void main(String args[]) {
		Student firstStudent=new Student();
		firstStudent.name="elon musk";
		firstStudent.age=30;
		System.out.println(firstStudent.hashCode());
		try {
			Student secondStudent=(Student)firstStudent.clone();
			System.out.println(secondStudent.name);
			System.out.println(secondStudent.age);
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
	}

}


