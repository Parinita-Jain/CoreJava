package practice;

public class BreakStatement {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			//base condition for the break statement
			if(i==5)
				break; //loop will terminate, move the control out of the loop
			System.out.println(i);
		}
	}

}
