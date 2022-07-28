package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionEx1 {

	public static void main(String[] args) throws IOException {
		//test3();
		//test4();
		//test5();
		test6();
	}
	
	//���� �ڵ�
	private static void test6() {
		try(FileInputStream fis = new FileInputStream("test.txt")){
			System.out.println("00000000000000000");
		} catch (FileNotFoundException e) {
			System.out.println("test.txt������ �����!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
	private static void test5() throws IOException {
		FileInputStream fis = new FileInputStream("test.txt");
		fis.close();
	}

	
	//���� �ڵ�
	private static void test4() {
		FileInputStream fis = null;
		
		try {
			 fis = new FileInputStream("test.txt");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("test.txt������ �����!!"+e.getMessage());
		}finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

}		
	
	

	private static void test3() {
		
			try {
				FileInputStream fis = new FileInputStream("test.txt");
				fis.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				System.out.println("test.txt������ �����!!"+e.getMessage());
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
}
