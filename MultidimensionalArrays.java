package basic;

public class MultidimensionalArrays {
	public static void main(String[] args) {
		int[][] marks = {{23,45,46},
						 {65,35,86},
						 {23,46,67},
						 {78,34,56}};
		
		System.out.println(marks.length);
		
		System.out.println(marks[1].length);
		
		
		//Nested Loops
		//outer loop will access the arrays within the main array
		for(int i=0;i<marks.length;i++) {
			//inner loop will access the values inside the inner arrays
			for(int j=0; j<marks[i].length;j++) {
				System.out.println("marks[" + i + "][" + j + "] = " + marks[i][j]);
			}
		}
		
		for(int[] a: marks) {
			for(int b : a) {
				System.out.println(b);
			}
		}
	}
}


