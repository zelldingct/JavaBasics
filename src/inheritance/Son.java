package inheritance;

public class Son extends Mom {
	
	public Son() {
		super("�Ƶ�");//super�� ���� ������ �����ڸ� �̿��Ѵ�.
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
