package jdkBasicClass;

public class StringBuilder_StringBuffer {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("aaaaaaaa");
		System.out.println("sb1=" + sb.toString());
		sb.setLength(0);
		System.out.println("sb2=" + sb.toString());
		
		StringBuffer sf = new StringBuffer();//ThreadSafe�� �ȴ�. ���� ��� X
		sf.append("aaaaaaaa");
		System.out.println("sb1=" + sf.toString());
		sf.setLength(0);
		System.out.println("sb2=" + sf.toString());
	}

}
