package oopsbasic;

public class MethodVarArgs {

	int addArrayValuesOnly(int[] values) {
		int sum = 0;
		
		for(int i : values)
			//sum = sum + i;
			sum += i;
		
		return sum;
	}
	
	//VarArgs Parameter
	int addRandomValues(int... values) {
		int sum = 0;
		
		for(int i : values)
			//sum = sum + i;
			sum += i;
		
		return sum;
	}
	
	public static void main(String[] args) {
		int arr[] = {4,6,7,3,4,7,8,3,3,7,8};
		
		MethodVarArgs m = new MethodVarArgs();
		System.out.println(m.addArrayValuesOnly(arr));
		
		System.out.println(m.addRandomValues(8,56,6,5,45,6,56,45,75,35));
	}

}
