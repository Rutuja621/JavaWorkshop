package runtimeexception.trip.com;

public class Akash {
	public static void main(String[] args) {
		try {
			System.out.println("Akash go to trip");
			boolean heIsSick=true;
		 if(!heIsSick) {
			// TODO: handle exception
			throw new illnessException();
		}else {
			System.out.println("Enjoy trip");
		}
		
	}finally {
		System.out.println("come to home");
	}
	}
}
