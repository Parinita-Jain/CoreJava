package practice;

public class SwitchCase {

	public static void main(String[] args) {
		int i = 3;
		switch(i) {
			case 1: System.out.println("one");
					break;
			default: System.out.println("default");
					break;
			case 2: System.out.println("two");
					break;
			case 3: System.out.println("three");			
		}
		
		String day = "saturday";
		switch(day) {
			//group of the cases
			case "monday":
			case "tuesday":
			case "wednesday":
			case "thursday":
			case "friday":System.out.println("weekday");
							break;
			case "saturday":
			case "sunday":System.out.println("weekend");
							break;
		}
	}

}
