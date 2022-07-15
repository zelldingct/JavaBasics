package array;

import java.util.ArrayList;

import object.Man;

public class ArrayListEx1 {
	
	public static void main(String args[]) {
		ArrayList<Man> people = new ArrayList<>();
		
		
		for(int i=0; i<9 ; i++) {
			Man m = new Man("김" + (i + 1) + "수");
			people.add(m);//위와 아래의 함수의 순서가 바뀌어도 상관없다.왜냐하면 buyCoffee는 arryList랑 상관없이 Heap영역에 있는 데이터를 건드리기 때문이다. 
			m.buyCoffee(1);//arrayList는 Heap영역에 있는 reference값을 가져오는 것이기 때문이다.
		}
		
		int size = people.size();
		for(int i=0; i<size ; i++) {
			System.out.println(people.get(i));
		}
		
	}
	
}
