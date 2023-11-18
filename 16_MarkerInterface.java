package abstraction;

//Marker Interface
interface Color{}

class Red implements Color{
	void screen() {}
}

class Blue implements Color{
	void sky() {}
}

//functional interface
@FunctionalInterface
interface Message{
	void send();
	//void rev();
}

public class MarkerInterface {
	Color c = new Red();
	
	Color c1 = new Blue();
}
