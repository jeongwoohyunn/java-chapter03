package io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class IOExample {

	public static void main(String[] args) throws IOException {//예외처리 안하고 함수로 보냄
		byte[] src = {0,1,2,3,4};//메모리에다 소스 마련 input
		
		byte[] dest=null;//output
		
		InputStream is = new ByteArrayInputStream(src);//주stream
		
		OutputStream os = new ByteArrayOutputStream();//얘는 내부에 버퍼가 있음. 생성하면서 꽂혀져잇음
		
		int data = -1;
		while((data =is.read()) !=-1) {
			os.write(data);//int>byte 
		}
		dest = ((ByteArrayOutputStream)os).toByteArray();
		
		System.out.println(Arrays.toString(src));//Arrays.toString 표현
		System.out.println(Arrays.toString(dest));
	}

}
