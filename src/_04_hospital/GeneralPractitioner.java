package _04_hospital;

public class GeneralPractitioner extends Doctor {

	@Override
	boolean performsSurgery() {
		// TODO Auto-generated method stub
		return false;
	}
	
	boolean makesHouseCalls() {
		// TODO Auto-generated method stub
		return true;
	}
}
