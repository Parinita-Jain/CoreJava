package inheritance;

final class cls1{
	
}

//we cannot inherited the final class
/*class cls2 extends cls1{
	
}*/

class cls3{
	final int A = 10;
	
	final String NAME;
	
	cls3(){
		//first value
		NAME = "itvedant";
	}
	
	final void display() {
		
	}
}

class cls4 extends cls3{
	//final method cannot be overridden
	/*void display() {
		
	}*/
}

public class FinalModifier {

	public static void main(String[] args) {
		cls3 c = new cls3();
		
		//final variable cannot be reassigned
		//c.A = 9;
		
		//c.NAME = "computer";
	}

}
