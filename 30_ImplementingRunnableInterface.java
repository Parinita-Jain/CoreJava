package threading;

class MyThreadImpl implements Runnable{
	@Override
	public void run() {
		for(int i=1;i<=100;i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
	}
}

public class ImplementingRunnableInterface {
	public static void main(String[] args) {
		MyThreadImpl impl = new MyThreadImpl();
		
		Thread t1 = new Thread(impl,"T1");
		Thread t2 = new Thread(impl,"T2");
		
		t1.start();
		t2.start();
	}
}
