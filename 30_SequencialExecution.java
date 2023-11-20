package threading;

public class SequencialExecution {
	public static void execute(String pName) {
		for(int i=1;i<=100;i++) {
			System.out.println(pName + " " + i);
		}
	}
	
	public static void main(String[] args) {
		execute("p1");
		execute("p2");
	}
}
