package com.springframework.springcore.LifeCycle.Annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestInterfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			AbstractApplicationContext context = new ClassPathXmlApplicationContext(
					"/com/springframework/springcore/LifeCycle/Annotations/configAnnotations.xml");
			Patient patient = (Patient) context.getBean("patients");
			System.out.println(patient);
			// Register shutdown Hook
			context.registerShutdownHook(); 
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
