package javaIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteExam {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		
		
		
		try {
			fis = new FileInputStream("src/javaIO/ByteExam.java");
			fos = new FileOutputStream("byte.txt");
			
			int readData = -1;
			int count = 0;
			while((readData = fis.read()) != -1) {
				
				
				fos.write(readData);
				count++;
				System.out.println(count);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// long endTime = System.currentTimeMillis();
		// System.out.println(endTime - startTime);
	}

}