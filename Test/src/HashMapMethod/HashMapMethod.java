package HashMapMethod;
import java.util.HashMap;
import java.util.Map;
import java.util.Map;
import java.util.Set;

public class HashMapMethod {
	public static void main(String[] args) {
		Map<Integer, String> hMap1 = new HashMap<Integer, String>();
		hMap1.put(2, "나다라");
		hMap1.put(1, "가나다");
		hMap1.put(3, "다라마");
		System.out.println(hMap1.toString());
		
		Map<Integer, String> hMap2 = new HashMap<Integer, String>();
		hMap2.putAll(hMap1);
		System.out.println(hMap2.toString());
		hMap2.replace(1, "가가가");
		hMap2.replace(4, "라라라");
		System.out.println(hMap2.toString());
		
		hMap2.replace(1, "가가가", "나나나");
		System.out.println(hMap2.get(1));
		System.out.println(hMap2.containsKey(1));
		System.out.println(hMap2.containsValue("나나나"));
		
		Set<Integer> keySet = hMap2.keySet();
		Set<Map.Entry<Integer, String>> entrySet = hMap2.entrySet();
	}
}
