package javaUtilStream;

public class Student implements Cloneable, Comparable<Student> {
	private int id;
	private String name;

	@Override
	public int compareTo(Student o) {
		System.out.println("comp="+this.id + "-" + o.id);
		return (this.id -o.id)*(-1);
	}
	
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public Student() {
		this.name ="Guest";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name + "(" + id + ")";
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;

		if (obj == null)
			return false;

		if (getClass() != obj.getClass())
			return false;

		Student other = (Student) obj;
		if (this.id != other.id)
			return false;

		if (this.name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;

		return true;

		
//		 Student other = (Student) obj; 
//		 return this.id == other.id && this.name !=null && this.name.equals(other.name);
		 
		 
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		Student s = new Student(921234, "홍길동");
		Student s2 = (Student)s.clone();
		System.out.println(s2);
	}
	
	public Object clone() throws CloneNotSupportedException {
		Student clobj = (Student)super.clone();
		clobj.name = clobj.name + "복제본!";
		return clobj;
	}

}
