package javaUtilStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMain {

	public static void main(String[] args) {
		//test1();
		//test2();
		test3();
	}

	private static void test3() {
		List<Student> students = new ArrayList<>();
		students.add(new Student(90, "È«±æµ¿"));
		students.add(new Student(80, "±èÀÏ¼ö"));
		students.add(new Student(75, "±èÀÌ¼ö"));
		students.add(new Student(95, "±è»ï¼ö"));
		
		students.forEach(s -> System.out.println("ÀÌ¸§="+s.getName()));
		
		Student[] arr = new Student[students.size()];
		students.toArray(arr);
		
		
		
		int sum = Arrays.stream(arr).mapToInt(s -> s.getId()).sum();
		double avg = Arrays.stream(arr).mapToInt(s -> s.getId()).average().getAsDouble();
		System.out.println("sum="+sum);
		System.out.println("avg="+avg);
		
		Arrays.stream(arr).filter(s -> s.getId()>=90).sorted().forEach(s -> System.out.println(s));
	}

	private static void test2() {
		int[] arr = new int[] { 2, 3, 1, 5, 3, 2 };
		
		
		double avg = Arrays.stream(arr).average().getAsDouble();//Æò±Õ
		System.out.println("avg= " +avg);
		
		Arrays.stream(arr).sorted().forEach(n -> System.out.print(n));//sort
		System.out.println();
		
		Arrays.stream(arr).distinct().forEach(n -> System.out.println("distinct=" + n));//duplicate Á¦°Å
		Arrays.stream(arr).distinct().sorted().forEach(n -> System.out.println("SortDistinct=" + n));
		Arrays.stream(arr).filter(n -> n > 2).forEach(n -> System.out.print(n));//Æ¯Á¤ Á¶°Ç ¸¸Á·ÇÏ´Â °ª Ã£±â
		System.out.println();
		
		System.out.println(Arrays.stream(arr).reduce(0, (p, n) -> p + n));
		
	}

	private static void test1() {
		List<Student> students = new ArrayList<>();
		students.add(new Student(100, "Hong100"));
		students.add(new Student(50, "Lim50"));
		students.add(new Student(20, "Lee20"));
		students.add(new Student(5, "A5"));
		
		System.out.println(students);
		System.out.println("__________________________________");
		Collections.sort(students, new Sorting());
		System.out.println(students);
		System.out.println();
		students.stream().map(s -> s.getName()).forEach(n -> System.out.println("s= "+n));
		System.out.println(students.stream().mapToInt(s -> s.getId()).sum());
	}

}
