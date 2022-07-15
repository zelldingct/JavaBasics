package firstPractice;

public class CallByValueReference {
	int m = 2;

	public static void main(String[] args) {
//		int i =1;
//		System.out.println("i="	+  i);
//		change1(i);
//		System.out.println("i="	+  i);
	 
		CallByValueReference cbvr = new CallByValueReference();
		System.out.println("cb1=" + cbvr.m);
		
		change2(cbvr);
		System.out.println("cb2=" + cbvr.m);
	 
	 
	}
	
	public static void change1( int x) {
		x=100;	
	}
	
	public static void change2( CallByValueReference cb) {
		cb.m = 100;
	}

}
