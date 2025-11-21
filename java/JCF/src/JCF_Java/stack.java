package JCF_Java;


import java.util.*;

public class stack {

	public static void main(String[] args) {
		Stack<Integer> sta = new Stack<>();
		sta.push(2); sta.add(3); sta.push(4); sta.push(5);
		sta.pop();
		System.out.println(sta.isEmpty());
		System.out.println(sta.size());
		System.out.println(sta.peek());
		
		System.out.println(sta.search(5));
		for (int x : sta) {
			System.out.print(x + " ");	

		}
		System.out.println();
		for (int i = 0; i < sta.size(); i++) {
			System.out.print(sta.get(i) + " ");	
		}	
		sta.remove(0);   // index 삭제 가능
		sta.remove((Integer)5); // 값으로 삭제 가능
		

	}

}
