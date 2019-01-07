package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HsahMapTest {

	public static void main(String[] args) {
		Map<String, Integer> m = new HashMap<String, Integer>();

		// key type, data type
		// 키는 해쉬가 오버로이드되있어야한다.
		//
		m.put("one", 1);// auto boxing
		m.put("two", 2);
		m.put("three", 3);

		int i = m.get("two");// auto unboxing
		System.out.println(i);

		// error가 날지 덮을지

		m.put("three", 33333);
		System.out.println(m.get("three"));
		// 덮어버림

		// 순회
		Set<String> keys = m.keySet();
		for (String key : keys) {
			int value = m.get(key);
			System.out.println(value);
		}

	}

}
