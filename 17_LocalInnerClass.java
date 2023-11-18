package nestedclasses;

class Laptop{
	private String name;
	private double price;
	
	class Processor{
		String manufacturer;
		double cores;
		
		double getCache() {
			return 4.3;
		}
		
		double getPrice() {
			return price;
		}
	}
}

public class LocalInnerClass {

	public static void main(String[] args) {
		Laptop myLaptop = new Laptop();
		Laptop.Processor proc = myLaptop.new Processor();
		System.out.println(proc.getCache());
		System.out.println(proc.getPrice());
	}

}
