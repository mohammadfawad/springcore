package com.springframework.springcore.LifeCycle.DependancyCheck;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDependancyCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {

			ApplicationContext context = new ClassPathXmlApplicationContext(
					"/com/springframework/springcore/LifeCycle/DependancyCheck/configDependancyCheck.xml");
			Prescription prescription = (Prescription) context.getBean("prescription");
			System.out.println(prescription);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
