package threading;

class Sender{
	public void sendMessage(String message) {
		System.out.println("\nSending " + message);
		
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("\n" + message + " Sent");
	}
}

class SendUsingThread extends Thread{
	private String message;
	Sender sender;
	
	public SendUsingThread(String message, Sender sender) {
		this.message = message;
		this.sender = sender;
	}
	
	@Override
	public void run() {
		synchronized (sender) {
			sender.sendMessage(message);
		}
	}
}

public class SynchronizedBlock {
	public static void main(String[] args) {
		Sender sender = new Sender();
		
		SendUsingThread sender1 = new SendUsingThread("Hello ", sender);
		SendUsingThread sender2 = new SendUsingThread("Welcome to Itvedant", sender);
		SendUsingThread sender3 = new SendUsingThread("Learning Threads", sender);
		sender1.start();
		sender2.start();
		sender3.start();
	}
}
