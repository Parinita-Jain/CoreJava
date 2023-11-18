package stringanddate;

public class StringComparison {

	public static void main(String[] args) {
		String a = "hello";
		String b = "hello";
		
		System.out.println(a + " " + a.hashCode());
		System.out.println(b + " " + b.hashCode());
		
		System.out.println(a==b);
		
		String c = new String("hello");
		System.out.println(a==c);
		
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		
		System.out.println(a.compareTo(b));
		System.out.println(a.compareTo(c));
		
		String d = "helloworld";
		System.out.println(a.compareTo(d));
	}

}
