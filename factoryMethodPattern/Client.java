package factoryMethodPattern;

public class Client {

	public static void main(String[] args) {
		UserFactory naverUserFactory = new NaverUserFactory();
		User naverUser = naverUserFactory.newInstance();
		
		UserFactory kakaoUserFactory = new KakaoUserFactory();
		User kakaoUser = kakaoUserFactory.newInstance();
	}

}
