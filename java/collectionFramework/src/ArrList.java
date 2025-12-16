import java.util.*;

public class ArrList {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2); list.add(10); list.add(12); // �� �߰�
        list.get(0); // �ε��� ������� �� ��������
        list.set(0, 20); // �� ��° �ε����� �� 20���� �ٲٱ�
        for (int x : list) {
            System.out.print(x + " ");
        }
        System.out.println();

        list.remove(0); // �ε��� ��������
        for (int x : list) {
            System.out.print(x + " ");
        }
        System.out.println();

        list.remove(Integer.valueOf(10)); // ���� ã�Ƽ� �� �ε��� ����
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
////		hashmap.remove("123"); // ������ ����
//		for (String temp : hashmap.keySet()) {
//			System.out.print(temp + " " + hashmap.get(temp));
//		}
//		System.out.println();
//
//		HashSet<Integer> hashset = new HashSet<>();
//		hashset.add(1);
//		hashset.add(2);
//		hashset.add(2); // ���õ�
//		System.out.println(hashset.contains(1));

    }

}
