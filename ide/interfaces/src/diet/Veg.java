package diet;
//in this class the Diet and the Diet interface extends the Sports interface
//that why we can use methods from the both interfaces
public class Veg implements Diet{
	//
	//this method is overrided from the Diet interface
	public String getDiet() {
		return "Fruits";
	}

	//this methods are overrided from Sports interface
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Cricket";
	}

	@Override
	public String getPractice() {
		// TODO Auto-generated method stub
		return "Balling";
	}

}
