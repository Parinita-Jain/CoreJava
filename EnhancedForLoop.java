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
		}
	}

}
