package factoryMethodPattern;

public class KakaoUserFactory extends UserFactory{

	@Override
	protected User createUser() {
		return new KakaoUser();
	}
	
}
