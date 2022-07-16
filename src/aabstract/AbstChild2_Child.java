package aabstract;

public class AbstChild2_Child extends AbstChild2{//이 녀석은 최상위 추상클래스의 추상메소드를 가지고 있어야한다.

	@Override
	public int max(int i, int j) { //이 max라는 추상메소드가 만약 Child2에만 있고 여기에는 없더라도 에러는 생기지 않는다.
									//즉, 상속이 많아질 경우 max라는 추상함수가 어디 있는지 찾아다니게 되는 경우가 생기게 된다.(단점)
									//또한 max라는 함수가 이곳 저곳에서 다른 형태의 구현체를 가지게 되므로 헷갈리게 되는 경우도 생기게 된다.
		return i>j ? i +100 : j+1000;
	}

}
