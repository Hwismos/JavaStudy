package abstractFactoryPattern;

public class TennisStaffFactory implements StaffFactory{

	@Override
	public Manager createManger() {
		System.out.println("Create Tennis Manager");
		return new TennisManager();
	}

	@Override
	public Player createPlayer() {
		System.out.println("Create Tennis Player");
		return new TennisPlayer();
	}

}
