package basic;

public class NestedLoop {
	public static void main(String[] args) {
		//outer loop
		for(int i=1;i<=5;i++) //outer loop will run 5 times
		{
			System.out.println(" i = " + i);
			
			//inner loop
			for(int j=1;j<=5;j++) 
			{
				System.out.println(" j = " + j);
			}
		}
	}
}
