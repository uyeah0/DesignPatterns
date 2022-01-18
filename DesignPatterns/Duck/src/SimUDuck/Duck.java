package SimUDuck;

public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;

	public Duck() {
		
	}
	abstract void display();
	void performQuack() {
		quackBehavior.quack();
	}
	void swim() {	
		System.out.println("모든 모리는 물에 뜹니다. 가짜 오리도 뜨죠.");
	}
	void performFly(){
		flyBehavior.fly();
	}
	
}
