package object;

public class Man {
	public static final int COFFEE = 3000;
	public static final int DONUT = 2500;
	
	private String name;
	private int amount;
	
	public void sayHello() {
		System.out.println("안녕하세요");
		System.out.println("제이름은 "+this.getName()+" 입니다.");
	}
	public Man() {
		this.amount = 10000;
	}
	
	public Man(String name) {
		this();
		this.name = name;
	}
	
	public void buyCoffee(int count) {
		this.subAmount(COFFEE, count);
	}
	
	public void buyDonut(int count) {
		this.subAmount(DONUT, count);
	}
	
	private void subAmount(int price, int count) {
		this.amount -= price*count;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return this.name + "님의 잔액은" + this.amount + "원 입니다.";
	}
	
	public static void main(String args[]) {
		Man hong = new Man("hong");
		Man john = new Man("john");
		
		hong.buyCoffee(1);
		hong.buyDonut(2);
		
		john.buyCoffee(2);
		john.buyDonut(1);
		
		System.out.println(hong);
		System.out.println(john);
	}
	public void eatRice() {
		System.out.println("밥을 먹습니다.");
	}
}
