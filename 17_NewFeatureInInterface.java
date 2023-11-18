package abstraction;

interface Drawing{
	void draw();
	default void paint() {
		System.out.println("Default Method");
		chooseColor();
		choosePaper();
	}
	
	static void canvas() {
		System.out.println("Static Method");
		//chooseColor();
		choosePaper();
	}
	
	private void chooseColor() {
		System.out.println("Private Method");
	}
	
	private static void choosePaper() {
		System.out.println("Private Static Method");
	}
}

class ABC{
	static void a() {}
	
}

class DrawingStudent implements Drawing{

	@Override
	public void draw() {
		System.out.println("Abstract Method overridden in child class");
	}	
}

public class NewFeatureInInterface {

	public static void main(String[] args) {
		DrawingStudent d = new DrawingStudent();
		d.draw();
		d.paint();
		
		Drawing.canvas();
		
	}

}
