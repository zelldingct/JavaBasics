package aabstract;


public class Main {

	public static void main(String[] args) {
		//ex1();
		//weightEx();
		//animalEx();
		//netSportsEx();
		softWareEx();
	}

	private static void softWareEx() {
		SoftWare website = new WebSite();
		SoftWare mobile = new MobileApp();
		website.product();
		mobile.product();
	}

	private static void netSportsEx() {
		NetSport tennis = new Tennis();
		NetSport pingpong = new TableTennis();
		tennis.play();
		pingpong.play();
		
	}

	private static void animalEx() {
		Animal dog = new Dog();
		Animal cat = new Cat();
		
		dog.bark();
		cat.bark();
		
		barkAnimal(cat);
		barkAnimal(dog);
	}
	
	private static void barkAnimal(Animal ani) {
		ani.bark();
	}

	private static void weightEx() {
		Weight guen = new Guen();
		Weight pound = new Pound();
		
		int cnt = 6;
		System.out.println("Guen= " + guen.getGram(cnt));
		System.out.println("Pound= " + pound.getGram(cnt));		
	}

	private static void ex1() {
		AbstSuper sp = new AbstChild();
		
		int x= 5;
		int y= 10;
		
		System.out.println("min= " + sp.min(x, y) + ", max=" + sp.max(x, y));
	}

}
