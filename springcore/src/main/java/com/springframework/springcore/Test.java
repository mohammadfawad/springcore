package com.springframework.springcore;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml")) {
			//Bean 1 emp
			Employee emp = (Employee) ctx.getBean("emp");
			System.out.println(emp.toString());
			//Bean 2 emp1
			Employee emp2 = (Employee) ctx.getBean("emp1");
			System.out.println(emp2.toString());
			//Bean 3 emp2
			Employee emp3 = (Employee) ctx.getBean("emp2");
			System.out.println(emp3.toString());
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
