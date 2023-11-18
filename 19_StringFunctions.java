package stringanddate;

public class StringFunctions {

	public static void main(String[] args) {
		String s = "Good Morning";
		
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		
		System.out.println(s.charAt(9));
		System.out.println(s.length());
		
		System.out.println(s.startsWith("G"));
		System.out.println(s.endsWith("g"));
		System.out.println(s.contains("i"));
		
		System.out.println(s.replace("o", "e"));
		System.out.println(s.substring(2));
		System.out.println(s.substring(2, 6));
		
		char[] chars = s.toCharArray();
		for(char c : chars) {
			System.out.println(c);
		}
		
		String ss = "Java is the most secure scalable and robust language";
		String[] words = ss.split(" ");
		System.out.println(words.length);
		
		for(String w : words) {
			System.out.println(w);
		}
		
		//StringBuffer and StringBuilder class has similar methods
		StringBuffer sb = new StringBuffer("Hello World");
		
		System.out.println(sb);
		
		System.out.println(sb.append(" Welcome to StringBuffer"));
		
		System.out.println(sb.insert(0, "Hi, "));
		
		System.out.println(sb.replace(0, 3, "Hello, "));
		
		System.out.println(sb.delete(7, 13));
		
		System.out.println(sb.reverse());
	}

}
