package com.springframework.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.core.convert.Property;

public class Hospital {

	private String hospitalName;
	private List<String> departments;
	private Set<String> branches;
	private Map<Integer, String> patient;
	private Properties doctorNameAndNationality;

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public List<String> getDepartments() {
		return departments;
	}

	public void setDepartments(List<String> departments) {
		this.departments = departments;
	}

	public Set<String> getBranches() {
		return branches;
	}

	public void setBranches(Set<String> branches) {
		this.branches = branches;
	}

	public Map<Integer, String> getPatient() {
		return patient;
	}

	public void setPatient(Map<Integer, String> patient) {
		this.patient = patient;
	}

	public Properties getDoctorNameAndNationality() {
		return doctorNameAndNationality;
	}

	public void setDoctorNameAndNationality(Properties doctorNameAndNationality) {
		this.doctorNameAndNationality = doctorNameAndNationality;
	}

	@Override
	public String toString() {
		return "Hospital [hospitalName=" + hospitalName + ", departments=" + departments + ", branches=" + branches
				+ ", patient=" + patient + "]";
	}

}
