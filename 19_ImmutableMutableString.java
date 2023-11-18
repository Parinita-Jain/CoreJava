package stringanddate;

public class ImmutableMutableString {
	public static void main(String[] args) {
		//Immutable String
		String s = "hello";
		System.out.println(s + " " + s.hashCode());
		
		s = s + " world";
		System.out.println(s + " " + s.hashCode());
		
		String s1 = new String("java");
		System.out.println(s1 + " " + s1.hashCode());
		
		s1 = s1 + " is wonderful";
		System.out.println(s1 + " " + s1.hashCode());
					
		//Mutable String
		StringBuffer s2 = new StringBuffer("StringBuffer");
		System.out.println(s2 + " " + s2.hashCode());
		
		s2.append(" added in java 1");
		System.out.println(s2 + " " + s2.hashCode());
		
		StringBuilder s3 = new StringBuilder("StringBuilder");
		System.out.println(s3 + " " + s3.hashCode());
		
		s3.append(" added in java 5");
		System.out.println(s3 + " " + s3.hashCode());
		
	}
}
