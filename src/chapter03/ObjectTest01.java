package chapter03;

public class ObjectTest01 {

	public static void main(String[] args) {
		Point p = new Point(10,20);
		
		System.out.println(p.getClass());//reflection 자기의 필드 정보를 런타임때 알수있다.
		Class k = p.getClass();
		
		System.out.println(p.hashCode());//reference value X (이 값은 레퍼런스 변수에 저장되어있음)
										 //해시코드값이 reference 값은 아니다
										 //address x
										 //hashing = 다양한 값들을 하나의 int형으로 만드는것 
										 //address 기반의 hsahing값
										 //encoding과는 다르게 얘는 검색,탐색이 빨라지라고 int로 바꾸는 것 
		System.out.println(p);
		System.out.println(p.toString()); //getclass() + "@" + hashCode()
		// println에서 객체가  들어가면 
		// 
	}

}
