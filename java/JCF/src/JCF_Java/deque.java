package JCF_Java;


import java.util.*;

public class deque {

	public static void main(String[] args) {
		Deque<Integer> dq = new ArrayDeque<>();
		dq.addLast(1);
		dq.addFirst(2);
		dq.addFirst(3);
		dq.addFirst(4);
		for (int x : dq) {
			System.out.print(x + " ");
		}
		System.out.println();
		dq.pollFirst();
		dq.pollLast();
		for (int x : dq) {
			System.out.print(x + " ");
		}
		
		System.out.println(dq.peekFirst());
		System.out.println(dq.peekLast());
		System.out.println(dq.contains(2));
	}

}
