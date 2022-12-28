package factoryMethodPattern;

public class NaverUserFactory extends UserFactory{

	@Override
	protected User createUser() {
		return new NaverUser();
	}
	
}
