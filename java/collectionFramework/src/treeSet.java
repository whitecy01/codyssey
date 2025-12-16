import java.util.*;

public class treeSet {

	public static void main(String[] args) {
		TreeSet<Integer> Tset = new TreeSet<>();
		Tset.add(2);
		Tset.add(3);
		for (int x : Tset) {
			System.out.print(x + " ");
		}
		Tset.remove(3);
		
		System.out.println(Tset.size());
		System.out.println(Tset.first());
		System.out.println(Tset.last());
		System.out.println(Tset.contains(2));
		
		
		
	}

}
