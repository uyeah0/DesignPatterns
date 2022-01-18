package SimUDuck;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck mallard = new MallardDuck();
		mallard.performQuack(); 
		// MallardDuck에서 상속받은 performQuack() 메소드 호출됩니다. 
		// 이 메소드에서는 객체의 QuackBehavior에게 할 일을 위임하죠.
		// quackBehavior 레퍼런스의 quack()메소드가 호출됩니다.
		mallard.performFly(); // performFly() 메소드도 호출합니다.
		
		Duck model = new ModelDuck();
		model.performFly(); // 처음 호출 시 ModelDuck생성자에서 설정되었던 FlyNoWay인스턴스의 fly()메소드가 호출
		model.setFlyBehavior(new FlyRocketPowered()); // 이렇게 하면 행동 세터 메소드 호출됩니다. 모형 오리에 로켓의 추진력으로 날 수 있는 능력이 생겼습니다.
		model.performFly(); // 모형 오리는 동적으로 나는 행동을 바꿀 수 있다.
		
	}

}
