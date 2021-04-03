package lab.two;

public class Lab12 {
	public static void main(String[] args) {
		String text1 = "You and me";
		String text2 = " You and me ";
		
		//1
		if(text1.equals(text2)) {
			System.out.println("true");
		}
		
		//2
		System.out.println(text1.contains("and"));
		System.out.println(text2.contains("me"));
		
		//3
		System.out.println(text1.length());
		System.out.println(text2.length());
		
		//4
		System.out.println(text1.substring(1,4));
		System.out.println(text2.substring(1,4));
		
		//5
		System.out.println(text1.trim());
		System.out.println(text2.trim());
		
		//6
		System.out.println(text1.toUpperCase());
		System.out.println(text2.toUpperCase());
		
		//7
		System.out.println(text2.toUpperCase().trim());
		
	}
}
