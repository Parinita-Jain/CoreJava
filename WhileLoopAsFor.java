package basic;

public class WhileLoopAsFor {
	public static void main(String[] args) {
		//Using for loop
		for(int i=1;i<=5;i++) {
			System.out.println(i);
		}
		
		//Using while loop
		//initialize_expression
		int i=1;
		//test_expression
		while(i<=5) {
			System.out.println(i);
			//update_expression
			i++;
		}
	}
}
