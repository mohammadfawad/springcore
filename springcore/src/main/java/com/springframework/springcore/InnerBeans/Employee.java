package com.springframework.springcore.InnerBeans;

/**
 *
 * @author spring
 */
public class Employee {

	private int employeeId;
	private String employeeName;
	private Address address;

	/**
	 * @return the employeeId
	 */
	public int getEmployeeId() {
		return employeeId;
	}

	/**
	 * @param employeeId the employeeId to set
	 */
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	/**
	 * @return the employeeName
	 */
	public String getEmployeeName() {
		return employeeName;
	}

	/**
	 * @param employeeName the employeeName to set
	 */
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	@Override
	public String toString() {
		return " \nEmployeeId : " + this.getEmployeeId() + " EmployeeName : " + this.getEmployeeName()
				+ " EmployeeAddress : " + this.getAddress();

	}

}
