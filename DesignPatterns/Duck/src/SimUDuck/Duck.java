package SimUDuck;

public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;

	public Duck() {
		
	}
	abstract void display();
	void performQuack() { // �������̽� ����
		quackBehavior.quack();
	}
	void swim() {	
		System.out.println("��� �𸮴� ���� ��ϴ�. ��¥ ������ ����.");
	}
	void performFly(){ // �������̽� ����
		flyBehavior.fly(); 
	}
	public void setFlyBehavior(FlyBehavior fb) { // ������ �ൿ�� �Ｎ���� �ٲٱ�
		flyBehavior = fb;
	}
	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior = qb;
	}
	
}
