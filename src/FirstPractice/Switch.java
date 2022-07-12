package FirstPractice;

public class Switch {

	public static void main(String[] args) {
		long ctm = System.currentTimeMillis() % 10;
		System.out.println("ctm=" + ctm);

		long sct = ctm % 3;

		switch ((int) sct) {
			case 1:
				System.out.println("one");
				break;
			case 2:
				System.out.println("two");
				break;
			default:
				System.out.println("zero");

		}

	}

}
