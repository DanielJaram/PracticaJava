package collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MapRunner {

	public static void main(String[] args) {
		String str = "This is an awesome ocation. "
				+ "This has never happened before"; 
		
		Map <Character, Integer> occurances = new HashMap<>();
		
		
		//Esto devolvera todos los elementos en una matriz de caracteres
		char[] characters = str.toCharArray();
		for(char character:characters) {
			Integer integer = occurances.get(character);
			if(integer == null ) {
				occurances.put(character, 1);
			} else {
				occurances.put(character, integer + 1);
			}
		}
		
		System.out.println(occurances);
		
		Map <String, Integer> stringOccurances = new HashMap<>();
		
		//Esto devolvera todos los elementos en una matriz de string
		String[] words = str.split(" ");
		for(String word:words) {
			Integer integer = stringOccurances.get(word);
			if(integer == null ) {
				stringOccurances.put(word, 1);
			} else {
				stringOccurances.put(word, integer + 1);
			}
		}
		
		System.out.println(stringOccurances);
	}

}
