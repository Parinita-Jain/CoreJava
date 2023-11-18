package nestedclasses;

class MessageOuter{
	
	void message() {
		
		//method local inner class declaration
		class MessageInner{
			
			String msgSubject;
			String msgBody;
			
			MessageInner(String msgSubject, String msgBody){
				this.msgBody = msgBody;
				this.msgSubject = msgSubject;
			}
			
			void display() {
				System.out.println("Subject: " + msgSubject);
				System.out.println("Message: " + msgBody);
			}			
		}
		
		//creating the instance of the method local inner class
		
		MessageInner msg1 = new MessageInner("welcome", "welcome to java");
		MessageInner msg2 = new MessageInner("pending", "complete the pending task");
		
		//calling the method of the method local inner class
		
		msg1.display();
		msg2.display();
	}	
}

public class MethodLocalInnerClass {

	public static void main(String[] args) {
		
		MessageOuter msg = new MessageOuter();
		msg.message();
	}
}
