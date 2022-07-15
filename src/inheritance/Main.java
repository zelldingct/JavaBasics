package inheritance;

import object.Man;

public class Main {

	public static void main(String[] args) {
		//momAndSon();
		koreanAndAmerican();
		
	}

	private static void koreanAndAmerican() {
		Korean korean = new Korean("ȫ�浿");
		Man American = new American("John");
		
		sayHi(korean);
		sayHi(American);
		
		//korean.sayHello();
		//American.sayHello();
	}

	private static void sayHi(Man man) {
		man.sayHello();
	}

	private static void momAndSon() {
		Mom mom = new Mom("����");
		Son son = new Son("�浿");//������: ���� �̸����� ������ �ٸ� instance�� ������ �� �ִ�.
							//�θ��� Type���� ����� ��� �ڽĿ��Ը� �ִ� �޼ҵ�� ȣ�� �Ұ��ϴ�.
		
		mom.eat();
		son.eat();
		
		mom.say();
		son.say();
		son.ttt();
		
		System.out.println(son.getName());//Method area�� getName�� �������� �Ŀ�
										//Heap area���� Name�� ������ ������ ����� ����ִ´�.
	}

}
