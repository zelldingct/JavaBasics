package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Collection {
	
	public static void main(String[] args) {
		//lists();
		//sets();
		//treesets();
		maps();
	}

	private static void maps() {
		Map<Integer,Student> map = new HashMap<>();
		Student s1 = new Student(100, "hong1");
		Student s2 = new Student(200, "hong2");
		Student s3 = new Student(300, "hong3");
		
		map.put(s1.getId(), s1);
		map.put(s2.getId(), s2);
		map.put(s3.getId(), s3);


		System.out.println(map);
	}

	private static void treesets() {
		TreeSet<Student> set = new TreeSet<>();
		set.add(new Student(100,"Hong"));
		set.add(new Student(2000,"Kim"));
		set.add(new Student(300,"Lee"));
		set.add(new Student(101,"Hong"));
		System.out.println(set);
	}

	private static void sets() {
		Set<Student> set = new HashSet<>();
		set.add(new Student(100,"Hong"));
		set.add(new Student(2000,"Kim"));
		set.add(new Student(300,"Lee"));
		set.add(new Student(100,"Hong"));
		System.out.println(set);
	}

	private static void lists() {
		List<String> lst1 = new ArrayList<String>();
		ArrayList<String> lst2 = new ArrayList<>();
		
		lst1.add("111");
		lst1.add("222");
		lst1.add("333");
		lst1.add("444");
		lst2.add("aaa");
		
		lst1.add(1,"100");
		
		System.out.println(lst1);
		System.out.println(lst2);
		
		boolean ispop =lst1.remove("100");//type이 boolean일때는 값을
		System.out.println("ispop="+ispop);
		System.out.println(lst1);
		String pop = lst1.remove(1);//type이 그외 일때 index 위치 숫자를 입력
		System.out.println("pop= " +pop);
		System.out.println(lst1);
	}

}
