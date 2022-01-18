package SimUDuck;

public class MallardDuck extends Duck{ 
	// Duck 클래스에서 quackBehavior과 flyBehavior 상속 받는다
	public MallardDuck() {
		quackBehavior = new Quack(); 
		// MallardDuck에서는 꽥꽥 거리는 소리를 처리할때는 Quack클래스를 사용하기 때문에
		// performQuack()이 호출되면 꽥꽥거리는 행동은 Quack 객체에게 위임됩니다.
		flyBehavior = new FlyWithWings(); // 날기
	}
	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("저는 물오리입니다.");
	}

}
