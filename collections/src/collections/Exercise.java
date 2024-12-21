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

}
