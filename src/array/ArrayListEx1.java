package array;

import java.util.ArrayList;

import object.Man;

public class ArrayListEx1 {
	
	public static void main(String args[]) {
		ArrayList<Man> people = new ArrayList<>();
		
		
		for(int i=0; i<9 ; i++) {
			Man m = new Man("��" + (i + 1) + "��");
			people.add(m);//���� �Ʒ��� �Լ��� ������ �ٲ� �������.�ֳ��ϸ� buyCoffee�� arryList�� ������� Heap������ �ִ� �����͸� �ǵ帮�� �����̴�. 
			m.buyCoffee(1);//arrayList�� Heap������ �ִ� reference���� �������� ���̱� �����̴�.
		}
		
		int size = people.size();
		for(int i=0; i<size ; i++) {
			System.out.println(people.get(i));
		}
		
	}
	
}
