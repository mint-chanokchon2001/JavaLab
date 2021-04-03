package lab.three;

public class menu {
	public static void main(String[] args) {
		Empoyee[] empoyee = new Empoyee[3];
		for (int i = 0; i < empoyee.length; i++) {
			empoyee[i] = new Empoyee("Chanokchon" + i, "Wongjampa" + i, 15000 * i);
		}
		System.out.println(empoyee[1].firstName);
		System.out.println(empoyee[1].lastName);
		System.out.println(empoyee[1].GetSalary());
		
		System.out.println(empoyee[2].firstName);
		System.out.println(empoyee[2].lastName);
		System.out.println(empoyee[2].GetSalary());
		
		System.out.println(Empoyee.planet);
		Empoyee.planet = "Mar";
		System.out.println(Empoyee.planet);
		
		Empoyee em2 = new Empoyee("Chanokchon","Wongjampa",13000);
		System.out.println(em2);
	}
	
}
