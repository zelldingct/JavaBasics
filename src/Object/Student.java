package object;

public class Student {
	private String studentNo;
	private String name;
	private int age;
	private String telno;
	
	public Student() {
		
	}

	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getTelno() {
		return telno;
	}

	public void setTelno(String telno) {
		this.telno = telno;
	}

	@Override
	public String toString() {
		return "Student [studentNo=" + studentNo + ", name=" + name + ", age=" + age + ", telno=" + telno + "]";
	}
	
	
}	

