package abstractFactoryPattern;

public class SoccerStaffFactory implements StaffFactory{

	@Override
	public Manager createManger() {
		System.out.println("Create Soccer Manager");
		return new SoccerManager();
	}

	@Override
	public Player createPlayer() {
		System.out.println("Create Soccer Player");
		return new SoccerPlayer();
	}

}
