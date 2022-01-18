package SimUDuck;

// Duck의 서브 클래스
public class ModelDuck extends Duck{

	public ModelDuck() {
		flyBehavior = new FlyNoWay(); // 이 오리는 날지 못한다
		quackBehavior = new Quack();
	}
	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("저는 모형 오리입니다.");
	}

	
}
