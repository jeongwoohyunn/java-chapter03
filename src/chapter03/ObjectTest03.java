package chapter03;

public class ObjectTest03 {

	public static void main(String[] args) {
		Rect r1 = new Rect(10,20);
		System.out.println(r1);
		Rect r2 = new Rect(20,10);
		System.out.println(r2.equals(r1));
		
		Rect r3 = new Rect(50,5);
		System.out.println(r3.equals(r1));
		
		//String equals 좋은 코드
		String s = "Hello World";
		System.out.println(equalHello(s));
		
	}
	
	public static boolean equalHello(String s) {
//		return s.equals("Hello");
		//String h = "Hello";
		return "Hello".equals(s);//한번만 쓸객체는 생성안해주고 바로쓰자.
	}

}
