package jdkBasicClass;

public class Main{

	public static void main(String[] args) throws CloneNotSupportedException {
		Student s = new Student(921234, "ȫ�浿");
		System.out.println(s);
		String ss = new String("ȫ�浿");
		Integer obj = new Integer(s.getId());
		Integer obj2 = new Integer(921234);
		System.out.println(s.getName().hashCode()+"::"+ss.hashCode());
		System.out.println(obj.hashCode() + "=" + obj2.hashCode());
		
		
		
		Student s1 = new Student(123, "Hong");
		Student s2 = new Student(456, "Kim");
		Student s3 = new Student(123, "Hong");
		System.out.println("s1 equals s2 =" + s2.equals(s1)); // false
		System.out.println("s1 equals s3 =" + s3.equals(s1)); // true

	}

}
