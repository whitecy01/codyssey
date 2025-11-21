package JCF_Java;

import java.util.*;

public class hashSet {

	public static void main(String[] args) {
		HashSet hs = new HashSet<>();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(4);
		hs.remove(4);
		System.out.println(hs.contains(4));
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
		
	}

}
