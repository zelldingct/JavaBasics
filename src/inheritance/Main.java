package inheritance;

import object.Man;

public class Main {

	public static void main(String[] args) {
		//momAndSon();
		koreanAndAmerican();
		
	}

	private static void koreanAndAmerican() {
		Korean korean = new Korean("홍길동");
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
		Mom mom = new Mom("영자");
		Son son = new Son("길동");//다형성: 같은 이름으로 쓰여도 다른 instance를 생성할 수 있다.
							//부모의 Type으로 선언될 경우 자식에게만 있는 메소드는 호출 불가하다.
		
		mom.eat();
		son.eat();
		
		mom.say();
		son.say();
		son.ttt();
		
		System.out.println(son.getName());//Method area의 getName을 가져오고 후에
										//Heap area에서 Name에 저장할 공간을 만들어 집어넣는다.
	}

}
