package lab.two;

public class Lab13 {
	public static void main(String[] args) {

		int[][] metrix = { { 1, 4 }, { 3, 4 } };

		// 1
		for (int i = 0; i < metrix.length; i++) {
			for (int j = 0; j < metrix[i].length; j++) {
				System.out.println(metrix[i][j]);
			}
		}

		// 2
		int result = 0;
		for (int i = 0; i < metrix.length; i++) {
			result += metrix[i][metrix[i].length - 1];
		}
		System.out.println(result);

	}
}
