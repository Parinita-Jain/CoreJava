package practice;

public class ContinueStatement {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			//base condition for the continue statement
			//if(i==5 || i==7)
			if(i%2==0)
				continue; //skip the next statement for current iteration
			System.out.println(i);
		}
	}
}
