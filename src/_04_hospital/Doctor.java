package _04_hospital;

import java.util.ArrayList;

public class Doctor {
	
	ArrayList<Patient> patients = new ArrayList<Patient>();
	
	boolean performsSurgery() {
		return false;
	}

	boolean makesHouseCalls() {
		// TODO Auto-generated method stub
		return false;
	}

	public void assignPatient(Patient patient) throws DoctorFullException {
		// TODO Auto-generated method stub
		if(patients.size() == 3) {
			throw new DoctorFullException();
		}
		else {
			patients.add(patient);
		}
	}

	public ArrayList<Patient> getPatients() {
		// TODO Auto-generated method stub
		return patients;
	}

	public void doMedicine() {
		// TODO Auto-generated method stub
		for(int i = 0; i < patients.size(); i++ ) {
			patients.get(i).checkPulse();
		}
	}
}
