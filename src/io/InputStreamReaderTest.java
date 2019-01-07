package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class InputStreamReaderTest {

	public static void main(String[] args) {
		InputStreamReader isr = null;
		
		
		try {
			//기반스트림
			FileInputStream fis = new FileInputStream("ms949.txt");
			int data =-1;
			while((data = isr.read()) !=-1) {
				System.out.println((char)data);
			}
			//보조 스트림
			isr = new InputStreamReader(fis,"MS949");
			
		} catch (FileNotFoundException e) {
			System.out.println("File Not Fuond : "+e);
		}catch (UnsupportedEncodingException e) {
			System.out.println("Unsupported Encoding"+e);
		}catch (IOException e) {
			System.out.println("Error:"+e);
		}finally {
			try {
				if(isr!=null) {
					isr.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
