package collections;

import java.util.Arrays;

public class Exercise {
	
	public class StringMagic {

	    public boolean areAnagrams(String str1, String str2) {
	    
	    	// Manejar cadenas nulas
	        if(str1 == null || str2 == null){
	            return false;
	        }
	        // Comprueba si las longitudes de las cadenas son diferentes
	        if(str1.length() != str2.length()){
	            return false;
	        }
	        
	        //poner todo en minusculas
	        String st1 = str1.toLowerCase();
	        String st2 = str2.toLowerCase();
	        // Convertir cadenas en matrices de caracteres
	        char[] s1 = st1.toCharArray();
	        char[] s2 = st2.toCharArray();
	        // Ordenar las matrices de caracteres
	        Arrays.sort(s1);
	        Arrays.sort(s2);
	        // Verificar si las matrices de caracteres ordenadas son las mismas
	        boolean st = Arrays.equals(s1,s2);
	        
	        return st;
	    }
	}
	
	public class MyString {
		 
	    public String str;
	 
	    public MyString(String str) {
	        this.str = str;
	    }
	    
	    public boolean isHexadecimalChar(char ch) {
	    	// Verificar si el car�cter est� en el rango de d�gitos hexadecimales (A-F o a-f)
	        return (ch >= 'A' && ch <= 'F') || (ch >= 'a' && ch <= 'f');
	    }
	 
	    public boolean isHexadecimal() {
	    	// Una cadena nula o una cadena vac�a no es un valor hexadecimal v�lido
	        if (str == null || str.length() == 0) {
	            return false;
	        }
	 
	        for (char ch : str.toCharArray()) {
	        	// Si alg�n car�cter no es un d�gito o un car�cter hexadecimal, no es un car�cter hexadecimal v�lido.
	            if (!Character.isDigit(ch) && !isHexadecimalChar(ch)) {
	                return false;
	            }
	        }
	 
	     // Si hemos recorrido todos los caracteres y todos son v�lidos,
	     // entonces la cadena es un hexadecimal v�lido
	        return true;
	    }
	 
	    
	}
	
	public class StringMagic2 {

        public String reverseWordsInSentence(String sentence) {
        // Caso especial: si la oraci�n es nula, devuelve "INVALIDO".
        if (sentence == null) {
            return "INVALID";
        }
 
        // Caso especial: si la oraci�n est� vac�a, devuelve una cadena vac�a.
        if (sentence.isEmpty()) {
            return "";
        }
 
        // Divide la oraci�n en palabras
        String[] words = sentence.split(" ");
 
        // Inicializa un StringBuilder para almacenar la oraci�n invertida.
        StringBuilder reversedSentence = new StringBuilder();
 
        // Itera sobre cada palabra e invi�rtela.
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word).reverse();
            reversedSentence.append(reversedWord).append(" ");
        }
 
        // Elimina cualquier espacio en blanco al final y devuelve la oraci�n invertida.
        return reversedSentence.toString().trim();
	    }
	}

}
