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
		System.out.println("��� �𸮴� ���� ��ϴ�. ��¥ ������ ����.");
	}
	void performFly(){
		flyBehavior.fly();
	}
	
}
