package inheritance;

public class Mom {
	protected String name;
	
	public Mom(String name) {
		this.name =name;
	}
	
	public Mom() {
		this("¾ö¸¶");
	}
	
	public String getName() {
		return this.name;
	}
	
	protected void eat() {
		System.out.println("Eat!!");
	}
	
	protected void say() {
		System.out.println("Mom said...");
	}
}
