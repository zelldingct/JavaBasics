package inheritance;

public class Son extends Mom {
	
	public Son() {
		super("아들");//super를 통해 엄마의 생성자를 이용한다.
	}
	
	public Son(String name) {
		super(name);
	}
	
	public void say() {
		System.out.println("Son said...");//overloading
	}
	
	public void ttt() {
		System.out.println("ttt");
	}

}
