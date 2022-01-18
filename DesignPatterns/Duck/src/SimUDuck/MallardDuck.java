package SimUDuck;

public class MallardDuck extends Duck{ 
	// Duck Ŭ�������� quackBehavior�� flyBehavior ��� �޴´�
	public MallardDuck() {
		quackBehavior = new Quack(); 
		// MallardDuck������ �в� �Ÿ��� �Ҹ��� ó���Ҷ��� QuackŬ������ ����ϱ� ������
		// performQuack()�� ȣ��Ǹ� �ваŸ��� �ൿ�� Quack ��ü���� ���ӵ˴ϴ�.
		flyBehavior = new FlyWithWings(); // ����
	}
	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("���� �������Դϴ�.");
	}

}
