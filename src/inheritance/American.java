package inheritance;

import object.Man;

public class American extends Man{
	public American(String name) {
		this.setName(name);
	}
	
	public void sayHello() {
		System.out.println("Hello");
		System.out.println("My name is "+this.getName());
	}

	public void eatBread() {
		System.out.println("eating bread");		
	}
	

}
