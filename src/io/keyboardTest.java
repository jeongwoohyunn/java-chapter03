package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class keyboardTest {

	public static void main(String[] args) {
		BufferedReader br = null;
		
		try {
		//기반스트림(표준입력,stdin,System.in)
		//이미 만들어져있으므로 생략
		
		//보조스트림1
			InputStreamReader isr = 
					new InputStreamReader(System.in,"UTF-8");
			
			//보조스트림2(char | char | char |.....|\n -> "charcharchar" )
			br = new BufferedReader(isr);
			
			//read
			String line = null;
			while((line = br.readLine())!=null) {
				if("exit".equals(line)) {
					break;
				}
				System.out.println(">>"+line);
			}
		} catch (IOException e) {
			System.out.println("Error : "+e);
		} finally {
			try {
				if(br !=null)
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
