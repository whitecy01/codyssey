package JCF_Java;

import java.util.*;

public class ArrList {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(2); list.add(10); list.add(12); // 값 추가
		list.get(0); // 인덱스 기반으로 값 가져오기
		list.set(0, 20); // 몇 번째 인덱스에 값 20으로 바꾸기
		for (int x : list) {
			System.out.print(x + " ");
		}
		System.out.println();
		
		list.remove(0); // 인덱스 기준으로
		for (int x : list) {
			System.out.print(x + " ");
		}
		System.out.println();
		
		list.remove(Integer.valueOf(10)); // 값을 찾아서 그 인덱스 삭제
		for (int x : list) {
			System.out.print(x + " ");
		}
		
		
		
		System.out.println(list.size());
		list.add(20);
		System.out.println(list.contains(20));
		//add, get, size, contains, remove, set()
		
		Collections.sort(list);
		Collections.sort(list, Collections.reverseOrder());
		
//		
//		
//		
//		HashMap<String, Integer> hashmap = new HashMap<>();
//		hashmap.put("123", 2);
//		hashmap.put("123", 4);
//		
//		System.out.println(hashmap.containsKey("123"));
//		hashmap.put("123", hashmap.getOrDefault("123", 0) + 1);
//		
////		hashmap.remove("123"); // 값으로 삭제
//		for (String temp : hashmap.keySet()) {
//			System.out.print(temp + " " + hashmap.get(temp));
//		}
//		System.out.println();
//		
//		HashSet<Integer> hashset = new HashSet<>();
//		hashset.add(1);
//		hashset.add(2);
//		hashset.add(2); // 무시됨
//		System.out.println(hashset.contains(1));

	}

}
