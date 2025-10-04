package multipleclassinterface;

public class Altroz implements CarCompany,RTOVerification{

	@Override
	//this method is overrided from interface RTOVerification
	public String getCarRegistrationNumber() {
		// TODO Auto-generated method stub
		return "MH123";
	}

	//this os overrided from interface CarCompany
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Rutuja";
	}

}
