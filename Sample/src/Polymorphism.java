
class Bird {
	void sing() {
		System.out.println("tweet tweet tweet");
	}
}

class Robin extends Bird {
	void sing(String song) {
		System.out.println("twiddledeedee");
	}
}

public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Robin r= new Robin();
 r.sing();
	}

}
