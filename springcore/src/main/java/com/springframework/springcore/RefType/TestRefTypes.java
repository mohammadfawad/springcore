package com.springframework.springcore.RefType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRefTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Student student = (Student) new ClassPathXmlApplicationContext(
					"/com/springframework/springcore/RefType/ReftypesConfig.xml").getBean("Student");
			Student student2 = (Student) new ClassPathXmlApplicationContext(
					"/com/springframework/springcore/RefType/ReftypesConfig.xml").getBean("Student2");

			System.out.println(student.toString());
			System.out.println(student2);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
