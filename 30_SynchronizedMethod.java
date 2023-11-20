package threading;

class Table{
	synchronized void printTable(int n) {
		for(int i=1;i<=10;i++) {
			System.out.println(i + " * " + n + " = " + (i*n));
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Thread1 extends Thread{
	Table t;
	
	public Thread1(Table t) {
		this.t = t;
	}
	@Override
	public void run() {
		t.printTable(2);
	}
}

class Thread2 extends Thread{
	Table t;
	
	public Thread2(Table t) {
		this.t = t;
	}
	@Override
	public void run() {
		t.printTable(8);
	}
}

public class SynchronizedMethod {
	public static void main(String[] args) {
		Table table = new Table();
		
		Thread1 t1 = new Thread1(table);
		Thread2 t2 = new Thread2(table);
		
		t1.start();
		t2.start();
	}
}
