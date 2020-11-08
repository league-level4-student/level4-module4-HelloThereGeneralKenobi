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

	public void assignPatientsToDoctors() throws DoctorFullException {
		// TODO Auto-generated method stub
		while(patientList.size() > 0) {
			for(int j= 0; j < docList.size(); j++) {
				try {
					docList.get(j).assignPatient(patientList.get(0));
					patientList.remove(0);
					break;
				}
				catch(DoctorFullException exception) {
					continue;
				}
				
			}
		}
	}
}
