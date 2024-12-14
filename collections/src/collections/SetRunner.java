package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetRunner {
	public static void main(String[] args) {
		List<Character> characters = List.of('A', 'Z', 'A', 'B', 'Z', 'F');
		// unique - set
		//Tree se ordena de forma ordenada
		//hash no te importa el orden
		//Linkedhash se ordena de acuerdo a como insertas los elementos
		
		Set<Character> treeSet = new TreeSet<>(characters);
		System.out.println("treeset" + treeSet);
		
		Set<Character> linkedHashSet = new LinkedHashSet<>(characters);
		System.out.println("linkedhashset" + linkedHashSet);
		
		Set<Character> hashSet = new HashSet<>(characters);
		System.out.println("hashSet" + hashSet);
	}

}
