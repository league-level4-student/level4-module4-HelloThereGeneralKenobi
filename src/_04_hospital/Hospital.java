package _04_hospital;

import java.util.ArrayList;

public class Hospital {
	
	ArrayList<Doctor> docList = new ArrayList<Doctor>();
	ArrayList<Patient> patientList = new ArrayList<Patient>();
	
	void addDoctor(Doctor doc) {
		docList.add(doc);
	}
	
	ArrayList<Doctor> getDoctors() {
		return docList;
	}
	
	void addPatient(Patient patient) {
		patientList.add(patient);
	}
	
	ArrayList<Patient> getPatients() {
		return patientList;
	}
}
