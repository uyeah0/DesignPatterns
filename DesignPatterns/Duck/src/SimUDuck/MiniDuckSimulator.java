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
	}

}
