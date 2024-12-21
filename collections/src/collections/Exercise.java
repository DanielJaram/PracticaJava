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
	    	// Verificar si el carácter está en el rango de dígitos hexadecimales (A-F o a-f)
	        return (ch >= 'A' && ch <= 'F') || (ch >= 'a' && ch <= 'f');
	    }
	 
	    public boolean isHexadecimal() {
	    	// Una cadena nula o una cadena vacía no es un valor hexadecimal válido
	        if (str == null || str.length() == 0) {
	            return false;
	        }
	 
	        for (char ch : str.toCharArray()) {
	        	// Si algún carácter no es un dígito o un carácter hexadecimal, no es un carácter hexadecimal válido.
	            if (!Character.isDigit(ch) && !isHexadecimalChar(ch)) {
	                return false;
	            }
	        }
	 
	     // Si hemos recorrido todos los caracteres y todos son válidos,
	     // entonces la cadena es un hexadecimal válido
	        return true;
	    }
	 
	    
	}
	
	public class StringMagic2 {

        public String reverseWordsInSentence(String sentence) {
        // Caso especial: si la oración es nula, devuelve "INVALIDO".
        if (sentence == null) {
            return "INVALID";
        }
 
        // Caso especial: si la oración está vacía, devuelve una cadena vacía.
        if (sentence.isEmpty()) {
            return "";
        }
 
        // Divide la oración en palabras
        String[] words = sentence.split(" ");
 
        // Inicializa un StringBuilder para almacenar la oración invertida.
        StringBuilder reversedSentence = new StringBuilder();
 
        // Itera sobre cada palabra e inviértela.
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word).reverse();
            reversedSentence.append(reversedWord).append(" ");
        }
 
        // Elimina cualquier espacio en blanco al final y devuelve la oración invertida.
        return reversedSentence.toString().trim();
	    }
	}

}
