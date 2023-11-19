package collectionapi;

public class WrapperClasses {
	public static void main(String[] args) {
		//primitive data type
		int i = 10;
		
		//Boxing - explicitly
		Integer newInt = Integer.valueOf(i);
		
		//Boxing - implicitly - Autoboxing
		//Compiler will implicitly call the valueOf() method
		//of the Integer class
		Integer autoInt = i;
		
		////////////////////////////////
		
		//Unboxing - explicitly
		int a = newInt.intValue();
		
		//Unboxing - implicitly
		//Compiler will implicitly call the intValue() method
		//of the Integer class
		int b = autoInt;
	}
}
