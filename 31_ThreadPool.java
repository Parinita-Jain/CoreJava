package threading;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ThreadImpl implements Runnable{
	int n;
	public ThreadImpl(int n) {
		this.n = n;
	}
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " started");
		for(int i = 1;i<=5;i++) {
			System.out.println(n*i);
		}
		System.out.println(Thread.currentThread().getName() + " stopped");
	}
}

public class ThreadPool {
	public static void main(String[] args) {
		//Thread Pool of 3 Threads
		ExecutorService executor = Executors.newFixedThreadPool(3);
		
		executor.execute(new ThreadImpl(8));
		executor.execute(new ThreadImpl(9));
		executor.execute(new ThreadImpl(5));
		executor.execute(new ThreadImpl(3));
		executor.execute(new ThreadImpl(7));
		executor.execute(new ThreadImpl(4));
		executor.execute(new ThreadImpl(10));
		executor.execute(new ThreadImpl(12));
		
		executor.shutdown();
	}
}
