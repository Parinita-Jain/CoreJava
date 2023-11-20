package threading;

public class ThreadSleep implements Runnable{
	@Override
	public void run() {
		for(int i=1;i<=100;i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
			
			if(i%5==0 && Thread.currentThread().getName().equals("Thread 1")) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}	
	
	public static void main(String[] args) {
		ThreadSleep ts = new ThreadSleep();
		
		Thread t1 = new Thread(ts,"Thread 1");
		Thread t2 = new Thread(ts,"Thread 2");
		
		t1.start();
		t2.start();
	}

}
