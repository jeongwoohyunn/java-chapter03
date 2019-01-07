package collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		Set<String> s = new HashSet<String>();
		
		String s1 = new String("고길동");
		String s2 = new String("고길동");
		s.add("둘리");
		s.add("마이콜");
		s.add(s1);
		s.add("고길동");
		//같은 객체로 존재여부를 따지는게 아니라
		//내용여부로
		s.contains(s2);
		
		System.out.println(s.contains(s2));
		System.out.println(s.size());
		
		String s3 = new String("고길동");
		s.remove(s3);
		
		//순회
		for (String str : s) {
			System.out.println(str);
		}
	}

}
