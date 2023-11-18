package abstraction;

//fully abstract class
/*abstract class Test{
	abstract void startTest();
	abstract void endTest();
}

abstract class Assignment{
	abstract void submitAssignment();
	abstract void getScore();
}

class Student extends Test, Assignment{	
}*/

interface Test{
	void startTest();
	void endTest();
}

interface Assignment{
	String SUBJECT = "english";
	
	void submitAssignment();
	void getScore();
}

class Student implements Test, Assignment{

	@Override
	public void submitAssignment() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getScore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void startTest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void endTest() {
		// TODO Auto-generated method stub
		
	}
	
}

public class Interfaces {
	//Test t = new Test();
	public static void main(String[] args) {
		System.out.println(Assignment.SUBJECT);
		
		//Assignment.SUBJECT="maths";
		
		Test t = new Student(); //upcasting
	}
	
}
