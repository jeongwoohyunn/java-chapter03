package chapter03;

import java.util.Arrays;

public class StringTest03 {

	public static void main(String[] args) {
		String s ="aBcABcabcAbc";
		System.out.println(s.length());
		
		System.out.println(s.charAt(2));
		System.out.println(s.indexOf("abc",6));
		System.out.println(s.substring(3));
		//끝을  안주면 n번쨰부터 끝까지
		System.out.println(s.substring(3,5));
		
		String s2 = "     ab cd     ";
		String s3 = "efg,joh,lmno,qp";
		
		String s4 = s2.concat(s);
		System.out.println(s4);
		
		System.out.println("----"+s4.trim()+"----");
		//앞뒤 공간제어
		
		//.* 모든문자열
		System.out.println("----"+s4.replaceAll("","")+"----");
		//공백제거
		
		String[] tokens = s3.split(",");
		for(String str : tokens) {
			System.out.println(str);
		}
		
		//StringBuffer
		StringBuffer sb = new StringBuffer();
		
		sb.append("Hello ");
		sb.append("World ");
		sb.append(2018);
		
		
		
		//String str = "hello"+ "world"+2018;
		String str = new StringBuffer("Hello ").
				append("World").
				append(2018).
				toString();
		
		//성능이 좋으나, +가 많은경우에는 가독성이 떨어지므로 x
		
		// 주의 : +연산자로 문자열을 더할 떄 밑의 예시
		String str2 = "";
		StringBuffer sb2 = new StringBuffer ("");
		for (int i = 0; i < 10; i++) {
			str2 = str2+i;
			//String str2 = new StringBuffer(str2).append(i);
			sb2.append(i);
		}//이럴떄 +쓰면안된다 +를 많이 쓸때 가독성떨어짐
		//format
		String name = "둘리";
		int score = 100;
		System.out.println(name + "님의 점수는"+ score+"점 입니다.");
		//String.format = c++에서 쓰듯이 쓰면된다.
		String str3 = String.format("%s님의 점수는 %d점입니다.",name,score);
		System.out.println(str3);
		
		//short int long byte char boolean float double
		//+reference 변수
		//Short integer
		//wrapper class 는 미리 기본함수들을 내포하고있다 보충 
		
	}

}
