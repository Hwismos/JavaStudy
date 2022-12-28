package part2;

public class Main {

	public static void main(String[] args) {
		RemoteControlloer rc1 = new Television("석휘");
		RemoteControlloer rc2 = new Television("유림");
		rc1.downChannel();
		rc2.upVolume();
		
		System.out.println(rc1.toString());
		System.out.println(rc2.toString());
		
		RemoteControlloer rcOfRadio = new Radio();
		rcOfRadio.upVolume();
	}
}
