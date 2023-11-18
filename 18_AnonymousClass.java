package nestedclasses;

abstract class Person{
	abstract void eat();
	abstract void sleep();
}

interface Transaction{
	void deposit();
	void withdraw();
}

public class AnonymousClass {

	public static void main(String[] args) {
		Transaction t = 
				//Anonymous
				new Transaction() {
			
			@Override
			public void withdraw() {
				System.out.println("Amount is withdrawn");				
			}
			
			@Override
			public void deposit() {
				System.out.println("Amount is deposited");
			}
		};
		
		t.withdraw();
		t.deposit();
		
		Person p = 
				//Anonymous Class
				new Person() {
			
			@Override
			void sleep() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			void eat() {
				// TODO Auto-generated method stub
				
			}
		};
	}

}
