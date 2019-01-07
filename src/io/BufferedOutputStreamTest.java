package io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamTest {

	public static void main(String[] args) {

		BufferedOutputStream bos = null;
		try {
			// 주스트림(기반 스트림 꽂다)소스에 연결
			FileOutputStream fos = new FileOutputStream("test.txt");
			
			//보조 스트림(기반 스트림에 연결)
			bos = new BufferedOutputStream(fos);
			//bos = new BufferedOutputStream(FileOutputStream fos);
			//바로 넣어도된다.
			//output
			for(int i='a';i<='z';i++) {
				//for(int i=97;i<=122;i++) {
				bos.write(i);//암시적 캐스팅
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found" + e);
		} catch(IOException e){
			System.out.println(e);
		}finally {
			try {//맨 앞의 보조스트림만 닫아도 다 닫힌다.
				if (bos != null) {
					bos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
//상속과는 다르게 런타임때 기능확장이 일어남

