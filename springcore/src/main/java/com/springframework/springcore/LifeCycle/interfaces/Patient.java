package com.springframework.springcore.LifeCycle.interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 *
 * @author spring
 */
public class Patient implements InitializingBean, DisposableBean{

	private String patientName;
	private int patientID;

	// Life Cycle init()
	public void patient_init() {

		System.out.println("Patient init()");
	}

	// Life Cycle destroy()
	public void patient_destroy() {

		System.out.println("Patient destroy()");
	}

	/**
	 * @return the patientName
	 */
	public String getPatientName() {
		return patientName;
	}

	/**
	 * @param patientName the patientName to set
	 */
	public void setPatientName(String patientName) {
		System.out.println("Patient setPatientName()");
		this.patientName = patientName;
	}

	/**
	 * @return the patientID
	 */
	public int getPatientID() {
		return patientID;
	}

	/**
	 * @param patientID the patientID to set
	 */
	public void setPatientID(int patientID) {
		System.out.println("Patient setPatientID()");
		this.patientID = patientID;
	}

	@Override
	public String toString() {
		return " PatienID : " + this.getPatientID() + " PatientName : " + this.getPatientName();

	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Interface DisposableBean destroy() Method ::");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Interface InitializingBean init afterPropertiesSet() Method ::");
		
	}
}
