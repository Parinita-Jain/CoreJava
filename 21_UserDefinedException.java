package exceptions;

class AgeException extends Exception{
	public AgeException() {
		super("Age should be between 18 and 30");
	}
}

class Customer{	
	private int id;
	private String name;
	private int age;
	
	public Customer(int id, String name, int age) 
			throws AgeException{
		super();
		this.id = id;
		this.name = name;
		if(age>=18 && age <=30)
			this.age = age;
		else
			throw new AgeException();
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
}

public class UserDefinedException {
	public static void main(String[] args) {
		Customer s1 = null;
		Customer s2 = null;
		try {
			s1 = new Customer(1,"harry",18);		
			s2 = new Customer(2, "mike", 14);
		}
		catch(AgeException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(s1);
		System.out.println(s2);
	}
}
