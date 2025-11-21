package JCF_Java;

import java.util.*;

public class Hashmap {
	public static void main(String[] args) {
		
		HashMap<String, Integer> hashmap = new HashMap<>();
		hashmap.put("123", 2);
		hashmap.put("4", 4);
		
		int value = hashmap.get("4");
		System.out.println(value);
		
		System.out.println(hashmap.containsKey("123"));
		System.out.println(hashmap.containsValue(2));
		hashmap.put("123", hashmap.getOrDefault("123", 0) + 1);
		
//		hashmap.remove("123"); // 값으로 삭제
		for (String temp : hashmap.keySet()) {
			System.out.print(temp + " " + hashmap.get(temp));
		}
		System.out.println();
		
		HashSet<Integer> hashset = new HashSet<>();
		hashset.add(1);
		hashset.add(2);
		hashset.add(2); // 무시됨
		System.out.println(hashset.contains(1));

	}

}
