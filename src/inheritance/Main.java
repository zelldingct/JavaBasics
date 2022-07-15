package inheritance;

import object.Man;

public class Main {

	public static void main(String[] args) {
		//momAndSon();
		// koreanAndAmerican();
		eatTest();
	}

	private static void eatTest() {
		Man korean = new Korean("홍길동");
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
			System.out.println("해당 인스턴스가 없습니다!!");
		}
	}

	private static void koreanAndAmerican() {
		Korean korean = new Korean("홍길동");
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
		Mom mom = new Mom("영자");
		Mom son = new Son("길동");// 다형성: 같은 이름으로 쓰여도 다른 instance를 생성할 수 있다.
		// 부모의 Type으로 선언될 경우 자식에게만 있는 메소드는 호출 불가하다.

		//mom.eat();
		//son.eat();
		eat(son);
		eat(mom);
		
		
		//mom.say();
		//son.say();
		//son.ttt();

		System.out.println(son.getName());// Method area의 getName을 가져오고 후에
											// Heap area에서 Name에 저장할 공간을 만들어 집어넣는다.
	}

	private static void eat(Mom m) {
		if (m instanceof Son) {
			System.out.println("먹어~~");

		} else if (m instanceof Mom)

		{
			System.out.println("드세요");
		} else {
			System.out.println("드쇼");
		}
	}

}
