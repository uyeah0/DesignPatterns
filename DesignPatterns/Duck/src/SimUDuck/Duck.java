package SimUDuck;

public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;

	public Duck() {
		
	}
	abstract void display();
	void performQuack() { // 인터페이스 구현
		quackBehavior.quack();
	}
	void swim() {	
		System.out.println("모든 모리는 물에 뜹니다. 가짜 오리도 뜨죠.");
	}
	void performFly(){ // 인터페이스 구현
		flyBehavior.fly(); 
	}
	public void setFlyBehavior(FlyBehavior fb) { // 오리의 행동을 즉석에서 바꾸기
		flyBehavior = fb;
	}
	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior = qb;
	}
	
}
