package collection;

import object.Man;

public class Person<T> {
	
		private T person;
		
		public void set(T person) {
			this.person = person;
		}
		
		public String getName() {
			return this.person.toString();
		}
		
		public static void main(String[] args) {
			Man m = new Man("¸Ç");
			Student stu = new Student(100, "Hong");
			
			Person<Man> mp = new Person<>();
			Person<Student> sp = new Person<>();
			mp.set(m);
			System.out.println(m.getName());
			sp.set(stu);
			System.out.println(stu.getName() + " " + stu.getId());
		}
	
	

}
