package abstractFactoryPattern;

public class Client {

	public static void main(String[] args) {
		use(new SoccerStaffFactory());
		use(new TennisStaffFactory());
	}
	
	private static void use(StaffFactory factory) {
		Manager manager = factory.createManger();
		Player player = factory.createPlayer();
	}

}
