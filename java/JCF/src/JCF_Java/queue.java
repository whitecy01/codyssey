package JCF_Java;

import java.util.*;

public class queue {

	public static void main(String[] args) {
		Queue<Integer> Q = new LinkedList<>();
		Q.add(2);
		Q.add(3);
		Q.add(4); // Q.offer();
		Q.remove(); // Q.remove({값}) -> 값 삭제, Q.poll();
		for (int x : Q) {
			System.out.println(x);
		}
		
		System.out.println(Q.peek());
		System.out.println(Q.size());
		System.out.println(Q.contains(2));
		
		
	}

}
