package iinterface;

public class CalculatorImpl2 implements Calc{

	@Override
	public void add(int x, int y) {
		System.out.println(x+y);
	}

	@Override
	public void sub(int x, int y) {
		System.out.println(x-y);
	}

	@Override
	public void mul(int x, int y) {
		System.out.println(x*y);
	}

	@Override
	public void div(int x, int y) {
		System.out.println(x/y);
	}

}
