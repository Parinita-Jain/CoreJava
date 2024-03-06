package practice;

public class NestedLoop {

	public static void main(String[] args) {
		//outer loop
		for(int i=1;i<=5;i++) {
			//inner loop
			for(int j=1;j<=5;j++) {
				System.out.println("i = " + i + ", j = " + j);
			}
		}
	}

}

/*
First Iteration of outer loop
i = 1, j = 1
i = 1, j = 2
i = 1, j = 3
i = 1, j = 4
i = 1, j = 5
Second Iteration of outer loop
i = 2, j = 1
i = 2, j = 2
i = 2, j = 3
i = 2, j = 4
i = 2, j = 5
Third Iteration
i = 3, j = 1
i = 3, j = 2
i = 3, j = 3
i = 3, j = 4
i = 3, j = 5
Fourth Iteration
i = 4, j = 1
i = 4, j = 2
i = 4, j = 3
i = 4, j = 4
i = 4, j = 5
Fifth Iteration
i = 5, j = 1
i = 5, j = 2
i = 5, j = 3
i = 5, j = 4
i = 5, j = 5
*/
