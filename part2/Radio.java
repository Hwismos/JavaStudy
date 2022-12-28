package part2;

public class Radio implements RemoteControlloer{

	@Override
	public void upVolume() {
		System.out.println("라디오의 볼륨을 올립니다.");
	}

	@Override
	public void downVolume() {
		System.out.println("라디오의 볼륨을 낮춥니다..");
	}

	@Override
	public void upChannel() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void downChannel() {
		// TODO Auto-generated method stub
		
	}

}
