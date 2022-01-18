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
		
		Duck model = new ModelDuck();
		model.performFly(); // ó�� ȣ�� �� ModelDuck�����ڿ��� �����Ǿ��� FlyNoWay�ν��Ͻ��� fly()�޼ҵ尡 ȣ��
		model.setFlyBehavior(new FlyRocketPowered()); // �̷��� �ϸ� �ൿ ���� �޼ҵ� ȣ��˴ϴ�. ���� ������ ������ ���������� �� �� �ִ� �ɷ��� ������ϴ�.
		model.performFly(); // ���� ������ �������� ���� �ൿ�� �ٲ� �� �ִ�.
		
	}

}
