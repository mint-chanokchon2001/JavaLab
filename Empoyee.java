package lab.three;

public class Empoyee {
	public String firstName;
	public String lastName;
	private int salary;
	public String position;
	public static String planet = "Earth"; //ทำให้ค่าในทุก instance เหมือนกันหมด
	
	public Empoyee(String firstName,String lastName,int salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	public static void main(String[] args) {
		Empoyee em = new Empoyee("A","B",1500);
		em.CheckPosition();
	}
	
	public void hello() {
		System.out.println("Hello " + firstName);
	}
	
	public int GetSalary() {
		return salary;
	}
	
	public void CheckPosition() {
		System.out.println(position);
	}
	//sysout จะมีเรียกใช้ method นี้ให้
	public String toString() {
		return "First : " + this.firstName + " Last : " + this.lastName;
	}
}
