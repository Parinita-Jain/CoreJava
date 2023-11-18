package abstraction;

abstract class CommonFunctions{
	void createLogin() {
		System.out.println("Login Created");
	}
	
	void login() {
		System.out.println("User Logged In");
	}
	
	abstract void viewContent();
}

class FreeUser extends CommonFunctions{

	@Override
	void viewContent() {
		System.out.println("User is able to view Free content");
	}
	
}

class VIPUser extends CommonFunctions{
	void viewContent() {
		System.out.println("User is able to view VIP content");
	}
}

class PremiumUser extends CommonFunctions{
	void viewContent() {
		System.out.println("User is able to view Premium content");
	}
}

public class AbstractModifier {
	
	public static void main(String[] args) {
		//CommonFunctions com = new CommonFunctions();
		
		CommonFunctions com = new FreeUser();
		com.viewContent();
		
		com = new PremiumUser();
		com.viewContent();
	}
}
