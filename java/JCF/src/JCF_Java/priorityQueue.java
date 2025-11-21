package JCF_Java;

import java.util.*;

public class priorityQueue {

	public static void main(String[] args) {

		PriorityQueue<Integer> P = new PriorityQueue<>();
		P.add(3);
		P.add(5);
		P.add(1);
		
		for (int x : P)
			System.out.print(x + " ");
		System.out.println();
		System.out.println(P.peek());
		
		
		P.poll();
		System.out.println(P.peek());
//		P.remove(5); // 특정값 삭제
		System.out.println(P.isEmpty());
		System.out.println(P.size());
//		P.clear();

		
	}

}
