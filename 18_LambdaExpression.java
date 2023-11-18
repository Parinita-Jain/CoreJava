package nestedclasses;

@FunctionalInterface
interface Perimeter{
	void calculate();
}

@FunctionalInterface
interface Message{
	void sendMessage(String msg);
}

@FunctionalInterface
interface Calculate{
	int add(int i, int j);
}

public class LambdaExpression {

	public static void main(String[] args) {
		//No-arg method
		Perimeter p = () -> {
			int side = 19;
			System.out.println("Perimeter of the square = " + (4 * side));
		};
		
		p.calculate();
		
		Message  m = msg -> {
			System.out.println("Hello from lambda expression " + msg);
		};
		
		m.sendMessage("one arg");
		m.sendMessage("calling again");
		
		//Method with only return statement
		Calculate c = (a,b) -> a+b;
		
		System.out.println("Sum = " + c.add(8, 3));
	}

}
