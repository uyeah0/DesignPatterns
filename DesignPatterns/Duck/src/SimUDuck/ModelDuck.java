package SimUDuck;

// Duck�� ���� Ŭ����
public class ModelDuck extends Duck{

	public ModelDuck() {
		flyBehavior = new FlyNoWay(); // �� ������ ���� ���Ѵ�
		quackBehavior = new Quack();
	}
	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("���� ���� �����Դϴ�.");
	}

	
}
