package SimUDuck;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck mallard = new MallardDuck();
		mallard.performQuack(); 
		// MallardDuck���� ��ӹ��� performQuack() �޼ҵ� ȣ��˴ϴ�. 
		// �� �޼ҵ忡���� ��ü�� QuackBehavior���� �� ���� ��������.
		// quackBehavior ���۷����� quack()�޼ҵ尡 ȣ��˴ϴ�.
		mallard.performFly(); // performFly() �޼ҵ嵵 ȣ���մϴ�.
	}

}
