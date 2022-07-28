package ioStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class StreamEx1 {

	private static final String FILE= "test.txt";
	
	public static void main(String[] args) {
		//writeFile("세종대왕 한글 123");
		//readFile();
		writeFile2("세종대왕 만세 123");
		readFile2();
	}

	private static void readFile2() {
		try (FileInputStream fis = new FileInputStream(FILE)) {
			InputStreamReader isr = new InputStreamReader(fis, CHARSET);
			BufferedReader br = new BufferedReader(isr);
			String data = null;
			while((data =br.readLine())!=null) {
				System.out.println(data);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static final String CHARSET = "UTF-8";
	
	private static void writeFile2(String content) {
		File file = new File(FILE);

		try (FileOutputStream fos = new FileOutputStream(file)) {
			OutputStreamWriter osw = new OutputStreamWriter(fos, CHARSET);
			BufferedWriter bw = new BufferedWriter(osw);
			bw.write(content);
			bw.flush();
			bw.close();
			
			System.out.println("Write OK : " + file.getAbsolutePath());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void readFile() {
		try (FileInputStream fis = new FileInputStream(FILE)) {
			int data = 0;
			//byte[] buffer = new byte[10]; ->바이트 단위로 읽을 수 있음
			while((data = fis.read()) != -1)
				System.out.println((char)data);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static void writeFile(String content) {
		File file = new File(FILE);
		
		try (FileOutputStream fos = new FileOutputStream(file)) {
			fos.write(content.getBytes());

			System.out.println("Write OK : " + 
									file.getAbsolutePath());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
