package array;

public class arrayEx1 {

	public static void main(String[] args) {
		// ex1();
		// ex2();
		// ex3();
		// ex4();
		// ex5();
		ex6();
	}

	private static void ex6() {
		int upperStart = 65;
		int lowerStart = 97;

		int[] starts = new int[] { upperStart, lowerStart };
		char[][] arr = new char[2][26];
		
		for (int start = 0; start<starts.length; start++) {
			for (int i = 0; i < 26; i++) {
				int x = i + starts[start];
				//System.out.println(i + "=" + (char) i);
				arr[start][i]=(char)x;
			}
		}
		
		for(int i=0; i< arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " " );
			}
			System.out.println();
		}
	}

	private static void ex5() {
		int[] arr1 = { 10, 20, 30, 40, 50 };
		int[] arr2 = { 1, 2, 3, 4, 5 };
		System.arraycopy(arr1, 0, arr2, 2, 3);// array copy 함수

		for (int i : arr2) {
			System.out.println(i);
		}

	}

	private static void ex4() {
		Man[] people = new Man[9];
		int len = people.length;

		for (int i = 0; i < len; i++) {
			people[i] = new Man("김" + (i + 1) + "수");
		}

		Man[] people2 = new Man[len];// 실제 생성된 객체의 수는 9개이다.
		for (int i = 0; i < len; i++) {
			people2[i] = people[i];// people2는 참조값을 복사하고 있다.
		}

		people[0].setName("김11111111111");

		for (Man man : people2) {
			System.out.println(man);// people의 0번 index값을 변경하였음에도 people2도 바뀐것을 알 수 있다.
		}
	}

	private static void ex3() {
		Man[] people = new Man[9];
		int len = people.length;
		for (int i = 0; i < len; i++) {
			people[i] = new Man("김" + (i + 1) + "수");
		}
		for (Man man : people) {
			System.out.println(man);
		}
	}

	private static void ex2() {
		String[] strs = new String[100];
		int len = strs.length;
		for (int i = 0; i < len; i++) {
			strs[i] = "str" + (i + 1);
		}

		printArray(strs);
	}

	private static void ex1() {
		int[] nums = new int[100];

		for (int i = 0; i < nums.length; i++) {
			nums[i] = i + 1;
		}

		printArray(nums);
	}

	private static void printArray(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}

	private static void printArray(String[] strs) {
		for (int i = 0; i < strs.length; i++) {
			System.out.println(strs[i]);
		}
	}

}
