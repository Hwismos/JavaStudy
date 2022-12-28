package part2;

public class Television implements RemoteControlloer{
	private String isIn;
	
	
	public Television(String isIn) {
		this.isIn = isIn;
	}

	@Override
	public void upVolume() {
		System.out.println("볼륨을 높입니다.");
	}

	@Override
	public void downVolume() {
		System.out.println("볼륨을 줄입니다.");
	}

	@Override
	public void upChannel() {
		System.out.println("채널을 올립니다.");
	}

	@Override
	public void downChannel() {
		System.out.println("채널을 내립니다.");
	}

	@Override
	public String toString() {
		return this.isIn + "집의 텔레비전";
	}
}
