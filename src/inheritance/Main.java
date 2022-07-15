package inheritance;

import object.Man;

public class Main {

	public static void main(String[] args) {
		//momAndSon();
		// koreanAndAmerican();
		eatTest();
	}

	private static void eatTest() {
		Man korean = new Korean("ȫ�浿");
		American american = new American("John");
		
		eat(korean);
		eat(american);
		//eat(american);
	}
	
	private static void eat(Man m) {
		if (m instanceof Korean) {
			((Korean)m).eatRice();
		}else if(m instanceof American) {
			((American)m).eatBread();
		}else {
			System.out.println("�ش� �ν��Ͻ��� �����ϴ�!!");
		}
	}

	private static void koreanAndAmerican() {
		Korean korean = new Korean("ȫ�浿");
		Man American = new American("John");

		sayHi(korean);
		sayHi(American);

		// korean.sayHello();
		// American.sayHello();
	}

	private static void sayHi(Man man) {
		man.sayHello();
	}

	private static void momAndSon() {
		Mom mom = new Mom("����");
		Mom son = new Son("�浿");// ������: ���� �̸����� ������ �ٸ� instance�� ������ �� �ִ�.
		// �θ��� Type���� ����� ��� �ڽĿ��Ը� �ִ� �޼ҵ�� ȣ�� �Ұ��ϴ�.

		//mom.eat();
		//son.eat();
		eat(son);
		eat(mom);
		
		
		//mom.say();
		//son.say();
		//son.ttt();

		System.out.println(son.getName());// Method area�� getName�� �������� �Ŀ�
											// Heap area���� Name�� ������ ������ ����� ����ִ´�.
	}

	private static void eat(Mom m) {
		if (m instanceof Son) {
			System.out.println("�Ծ�~~");

		} else if (m instanceof Mom)

		{
			System.out.println("�弼��");
		} else {
			System.out.println("���");
		}
	}

}
