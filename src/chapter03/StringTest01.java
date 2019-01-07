package chapter03;

public class StringTest01 {

	public static void main(String[] args) {
		// c:\temp x c:\\temp
		// /temp(unix) <-> d:\temp(window) - unix꺼가 호환성이 좋다.
		String s1 = "c:\\temp";
		// \n\r ->\r은 타자기 처럼 앞으로 당겨주는것
		// "Hello"
		String s2 = "\"Hello\"";

		System.out.println(s1);
		System.out.println(s2);

		// \t ->tab
		// \n -> new line
		// \r -> carriage return
		System.out.println("Helo\tWorld\n");
		System.out.println("Helo\tWorld");

		char c = '\'';
		System.out.println(c);
	}

}
