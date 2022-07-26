package innerClass;

public class Outer {

	private int id;
	private String name;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void callIn() {
		Inner inner = new Inner();
		inner.in();
	}
	
	class Inner{
		public void in() {
			System.out.println("in inner class>> name="+name);
		}
	}
	
	static class StaticInner{
		static String inStr = "Static Inner inStr";
		public static void in() {
			System.out.println("in inner class>> name="+inStr);
		}
	}

	public static void main(String[] args) {
		Outer o = new Outer();
		o.setName("Hong");
		System.out.println("o.name="+o.getName());
		o.callIn();
		
		//Inner inner = new Inner(); //Outer에 접근할 수 없다. Outer가 먼저 생성되어야한다.
		StaticInner.in();
	}

}
