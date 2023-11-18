package inheritance;

class Student{
	//hidden
	private int id;
	private String name;
	private float marks;
	
	//accessor
	public int getId() {
		return id;
	}
	
	//mutator
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}
}

public class Encapsulation {
	public static void main(String[] args) {
		Student s = new Student();
		s.setId(10);
		System.out.println(s.getId());
	}
}
