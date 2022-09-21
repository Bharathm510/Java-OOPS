

class student {
	private int rollno;
	private String name;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
		System.out.println("Updated roll no");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		student s1 = new student();
		s1.setRollno(2);
		s1.setName("Bharath");
		System.out.println(s1.getRollno());
		System.out.println(s1.getName());

	}

}
