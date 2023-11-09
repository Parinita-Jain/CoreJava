package basic;

public class EnhancedForLoop {
	public static void main(String[] args) {
		String[] names = new String[]
				{"harry","ron","mike","scott","smith"};
		
		for(String s : names) {
			System.out.println(s);
		}
		
		float[] temp = {56.78f, 68.34f, 56.90f};
		
		for(float i : temp) {
			System.out.println(i);
			i *= 10;
			System.out.println("After Update: " + i);
		}
		
		temp[0] = 78.45f;
		
		for(float a : temp) {
			System.out.println(a);
		}
		
		int[] numbers = {6,45,34,8,234,89,23,678,
				87,45,90,34,76,34,12,57,
				67,67,34,23,67,43};
		
		/*
		 * Find all the odd numbers in array provided
		 */
		
		System.out.println("Odd numbers are: ");
		for(int i : numbers) {
			if (i%2 != 0)
				System.out.println(i);
		}
		
	}

}
