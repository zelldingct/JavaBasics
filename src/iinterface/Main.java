package iinterface;

import java.sql.SQLException;

public class Main {

	public static void main(String[] args) throws SQLException {
		//calculator();
		//testinterface();
		//subTotal();
		calcOper();
	}

	private static void calcOper() {
		int x= 10; int y=5;
		CalcOper test = new CalcOper();
		test.mul(x, y);
		test.div(x, y);
	}

	private static void subTotal() {
		SubTotal test = new SubTotal();
		int[] arr = {1,2,3,4};
		System.out.println(test.sum(arr));
		
	}

	private static void testinterface() throws SQLException {
		TestInterface test = new TestImpl();
		test.select("select * from Table");
		TestInterface.out(100);
	}

	private static void calculator() {
		Calculator cal = new CalculatorImpl();
		int x= 10, y = 5;
		cal.add(x, y);
		cal.div(x, y);
		cal.mul(x, y);
		cal.sub(x, y);
	}

}
