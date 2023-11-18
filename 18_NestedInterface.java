package nestedclasses;

interface Showable{
	void show();
	//public and static
	interface Message{
		void send();
	}
}

class Drawing{
	//default and static
	interface Draw{
		void draw();
	}
}

class A implements Showable{
	@Override
	public void show() {
		// TODO Auto-generated method stub		
	}	
}

class B implements Showable.Message{
	@Override
	public void send() {
		// TODO Auto-generated method stub		
	}	
}

class C implements Drawing.Draw{
	@Override
	public void draw() {
		// TODO Auto-generated method stub		
	}	
}

public class NestedInterface {

}
