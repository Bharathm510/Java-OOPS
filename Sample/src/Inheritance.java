	
	class Logistics {
		void scooter() {
			System.out.println("Yamaha");
		}
	}
	
	class Vehicles extends Logistics {
		void Cycles() {
			System.out.println("Hero");
		}
		
	}
	
	class Cars extends Vehicles {
		void Car() {
			System.out.println("Audi");
			
		}
		
	}
	
	
	public class Inheritance {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Cars c = new Cars();
	c.scooter();
	c.Car();
	c.Cycles();

	}
	

}
