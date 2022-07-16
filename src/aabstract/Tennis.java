package aabstract;

public class Tennis extends NetSport {

	@Override
	public void serve() {
		System.out.println("Tennis Service!");
	}

	@Override
	public void hit() {
		System.out.println("Tennis Stroke!");
	}

	@Override
	public void score() {
		System.out.println("15!");
	}

}
