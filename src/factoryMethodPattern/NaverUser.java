package factoryMethodPattern;

public class NaverUser implements User{

	@Override
	public void signup() {
		System.out.println("Signup with Naver ID");
	}

}
