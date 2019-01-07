package chapter03;

public class ObjectTest02 {

	public static void main(String[] args) {
		Point p1 = new Point(10,20);
		Point p2 = new Point(10,20);
		Point p3 = p2;
		
		// == -> 두 객체의 동일성을 비교 toString은 객체의 내용을 볼때
		System.out.println(p1==p2);
		System.out.println(p2==p3);
		
		//equals() -> 두 객체의 동질성 비교, 내용비교
		//Object의 equals() 기본 구현은 == 연사 결과와 같다. 
		System.out.println(p1.equals(p2));
		System.out.println(p2.equals(p3));
		
		//String
		String s1 = new String("ABC");
		String s2 = new String("ABC");
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode()+ " : "+s2.hashCode());
		//자료구조 hash 내용기반
		
		System.out.println(System.identityHashCode(s1)+ " : "+System.identityHashCode(s2));
		//어드레스 기반의 해싱값
		//hashcode와 equals는 같이 쓴다(내용 비교를 위해).
		
		System.out.println("================================");
		String s3 = "ABC";
		String s4 = "ABC";
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		System.out.println(s3.hashCode() + " : "+ s4.hashCode());
		System.out.println(System.identityHashCode(s3)+" : "+System.identityHashCode(s4));
		
		
	}

}
