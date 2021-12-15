package com.springframework.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("/com/springframework/springcore/collections/collectionsConfig.xml");
		Hospital hospital = (Hospital) ctx.getBean("hospital");
		System.out.println(hospital.getHospitalName()+ "\n DEPARTMENTS LIST :: " + hospital.getDepartments() + "\n BRANCHES SET :: " + hospital.getBranches()+ "\n PATIENTS MAP :: " + hospital.getPatient()+ "\n DOCTOR-NATIONALITY PROPERTY :: " + hospital.getDoctorNameAndNationality() );
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
