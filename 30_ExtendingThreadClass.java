package threading;

class MyThread extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=100;i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
	}
}

public class ExtendingThreadClass {

	public static void main(String[] args) {
		MyThread thread1 = new MyThread();
		MyThread thread2 = new MyThread();
		
		thread1.setName("Thread1");
		thread2.setName("Thread2");
		
		//thread1.run();
		//thread2.run();
		
		thread1.start();
		thread2.start();
	}

}
