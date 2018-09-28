package javaIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteExam2 {

	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		
		
		
		try {
			fis = new FileInputStream("src/javaIO/ByteExam.java");
			fos = new FileOutputStream("byte.txt");
			
			int readCount = -1;
			byte[] buffer = new byte[512];
			
			while((readCount = fis.read(buffer)) != -1) {
				System.out.println(readCount);
				fos.write(buffer, 0, readCount);;
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