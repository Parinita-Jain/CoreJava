package threading;

class MainThreadImpl implements Runnable{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " started");
		System.out.println(Thread.currentThread().getName() + " stopped");
	}
}

class DaemonThreadImpl implements Runnable{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " started");
		System.out.println(Thread.currentThread().getName() + " stopped");
	}
}

public class DaemonThread {
	public static void main(String[] args) {
		Thread mainThread = new Thread(new MainThreadImpl(),"MainThread");
		
		Thread daemonThread = new Thread(new DaemonThreadImpl(),"DaemonThread");
		
		daemonThread.setDaemon(true);
		
		mainThread.start();
		daemonThread.start();
	}
}
