package lab.two;

public class Lab {
	public static void main(String[] args) {
		char[] text = { 'H', 'e', 'l', 'l', 'o' };
		String output = new String(text);

		// .equals() ตรวจสอบข้อความ
		if (output.equals("Hello")) {
			System.out.println(output);
		}

		// .contain() หาค่าในข้อความ
		String text2 = "Bike Chanokchon";
		String check = "bike";
		System.out.println(text2.contains(check));

		// .length() หาความยาวของข้อความ
		String text3 = "Legends";
		System.out.println(text3.length());

		// .substring(startIndex,EndIndex) นำข้อความบางส่วนขากข้อความยาว ๆ ออกมา
		String text4 = "Leagues of Legends";
		System.out.println(text4.substring(2, 5));

		// .trim() ตัดช่องว่างที่อยู่ด้านหน้าและด้านหลังของข้อความ
		String text5 = " Hello Teee ";
		System.out.println(text5.trim());

		// .toUpperCase() ทำให้เป็นตัวใหญ่ทั้งหมด
		String text6 = "NeeHue";
		System.out.println(text6.toUpperCase());

		// .toLowerCase() ทำให้เป็นตัวเล็กทั้งหมด
		String text7 = "NeeHue";
		System.out.println(text7.toLowerCase());
		
		// Method chaining
		String text8 = " HahaHuHu ";
		String finalWord = text8.trim().toLowerCase();
		System.out.println(finalWord);

	}
}
