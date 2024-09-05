package Array;

import java.util.ArrayList;
import java.util.List;

public class Exercise {

	
	public class StringMagic {
		 
	    /**
	     * This method finds the longest word in a given sentence.
	     *
	     * @param sentence The sentence to find the longest word in.
	     * @return The longest word in the sentence. If sentence is empty, return an empty string.
	     */
	    public String findLongestWord(String sentence) {
	 
	        // Caso extremo: Si la oración está vacía, devuelve una cadena vacía
	        if (sentence.isEmpty()) {
	            return "";
	        }
	 
	        // Divide la oración en palabras utilizando el espacio como separador
	        String[] words = sentence.split(" ");
	 
	        // Inicializa variables para llevar un registro de la palabra más larga y su longitud
	        String longestWord = "";
	        int maxLength = 0;
	 
	        // Itera sobre cada palabra en el arreglo de palabras
	        for (String word : words) {
	 
	            // Si la longitud de la palabra actual es mayor que maxLength, actualiza longestWord y maxLength
	            if (word.length() > maxLength) {
	                longestWord = word;
	                maxLength = word.length();
	            }
	        }
	 
	        // Devuelve la palabra más larga encontrada en la oración
	       
	 
	 return longestWord;
	    }
	    
	    /**
	     * This method determines whether there's an element greater than a given number in an array.
	     *
	     * @param array The array to search through.
	     * @param number The number to compare with the array elements.
	     * @return True if there's an element greater than the given number in the array, false otherwise.
	     */
	    public boolean doesHaveElementGreaterThan(int[] array, int number) {
	        if(array == null){
	            return false;
	        }
	        for(int arra : array){
	            if(arra > number){
	                return true;
	            }
	        }
	        return false;
	        // TODO: Write your code
	    }
	    
	    /**
	     * This method finds and returns the second largest element in the given array.
	     * 
	     * @param array the array in which to find the second largest element
	     * @return the second largest element in the array
	     */
	    
	    public int findSecondLargestElement(int[] array) {
	        
	        // Si el array tiene menos de 2 elementos, no se puede encontrar un segundo elemento más grande.
	        if (array.length < 2) {
	            return -1;  // Retorna -1 en este caso.
	        }

	        // Inicializa las variables para almacenar el elemento más grande y el segundo más grande.
	        int largest = Integer.MIN_VALUE;
	        int secondLargest = Integer.MIN_VALUE;

	        // Recorre cada elemento del array.
	        for (int element : array) {
	            // Si el elemento actual es mayor que el mayor encontrado hasta ahora...
	            if (element > largest) {
	                // ...el segundo mayor se convierte en el antiguo mayor.
	                secondLargest = largest;
	                // ...y el mayor se actualiza al nuevo valor.
	                largest = element;
	            } 
	            // Si el elemento actual es mayor que el segundo mayor, pero no es igual al mayor...
	            else if (element > secondLargest && element != largest) {
	                // ...actualiza el segundo mayor al valor del elemento actual.
	                secondLargest = element;
	            }
	        }

	        // Si no se encontró un segundo elemento más grande (por ejemplo, si todos los elementos son iguales),
	        // el segundo mayor seguirá siendo Integer.MIN_VALUE, así que retorna -1.
	        if (secondLargest == Integer.MIN_VALUE) {
	            return -1;
	        }

	        // Retorna el segundo mayor elemento encontrado.
	        return secondLargest;
	    }
	    
	    public class BiArray {
	    	 
	        // Estos son los dos arreglos que vamos a comparar
	        private int[] array1;
	        private int[] array2;
	     
	        // Este constructor inicializa los dos arreglos
	        public BiArray(int[] array1, int[] array2) {
	            this.array1 = array1;
	            this.array2 = array2;
	        }
	     
	        // Este método verifica si las sumas de los dos arreglos son iguales
	        public boolean areSumsEqual() {
	     
	            // Primero, calculamos la suma de cada arreglo
	            int sum1 = calculateSum(array1);
	            int sum2 = calculateSum(array2);
	     
	            // Luego, verificamos si las sumas son iguales
	            return sum1 == sum2;
	        }
	     
	        // Este método auxiliar privado calcula la suma de un arreglo
	        private int calculateSum(int[] array) {
	     
	            int sum = 0; // Initialize sum to 0
	     
	            // Para cada número en el arreglo, súmalo al total
	            for (int num : array) {
	                sum += num;
	            }
	     
	            // Regresa el total de la suma
	            return sum;
	        }
	    }
	    
	    public boolean isSorted(int[] array) {
	        if (array.length <= 1) {
	             return true;
	         }
	  
	         // Itera sobre el arreglo, comenzando desde el segundo elemento
	         for (int i = 1; i < array.length; i++) {
	             // Si el elemento actual es menor que el anterior, el arreglo no está ordenado, por lo que se debe devolver false
	             if (array[i] < array[i - 1]) {
	                 return false;
	             }
	         }
	  
	         // If the method has not returned yet, that means no elements were out of order, so the array is sorted.
	         return true;
	     }
	}
	
	public class ArrayMagic {
		 
	    /**
	     * This method reverses an array.
	     * 
	     * @param array the array to reverse
	     * @return a new array with elements in reverse order
	     */
	    public int[] reverseArray(int[] array) {
	 
	        // Caso extremo: Si el arreglo está vacío o contiene solo un elemento, devuelve el arreglo tal como está.
	        if (array.length <= 1) {
	            return array;
	        }
	 
	        // Inicializa los punteros al principio y al final del arreglo.
	        int start = 0;
	        int end = array.length - 1;
	 
	        // Crea un nuevo arreglo para almacenar los elementos invertidos.
	        int[] reversedArray = new int[array.length];
	 
	        // Recorre el arreglo desde ambos extremos hacia el centro.
	        while (start <= end) {
	            // Intercambia los elementos en los índices start y end.
	            reversedArray[start] = array[end];
	            reversedArray[end] = array[start];
	 
	            // Mueve los punteros hacia el centro.
	            start++;
	            end--;
	        }
	 
	        return reversedArray;
	    }
	}
	public class NumberMagic {
		 
	    /**
	     * This method returns all factors of a given number in an ArrayList.
	     * 
	     * @param number the number to find factors of
	     * @return a List of factors of the number
	     */
	    public List<Integer> determineAllFactors(int number) {
	 
	        // Caso extremo: Si el número es 0 o negativo, devuelve una lista vacía.
	        // La factorización generalmente se define para enteros positivos.
	        if (number <= 0) {
	            return new ArrayList<>();// asi es como devuelves un arraylist vacio
	        }
	 
	        List<Integer> factors = new ArrayList<>();
	 
	        // Comienza desde 1 e itera hasta el número dado.
	        // Verifica si el número es divisible por el valor actual del iterador (es decir, si es un factor). 
	        for (int i = 1; i <= number; i++) {
	            if (number % i == 0) {
	                // Si lo es, añádelo a la lista de factores.
	                factors.add(i);
	            }
	        }
	 
	        return factors;
	    }
	}
	
	public class NumberMagic2 {
	    /**
	     * This method generates a list of multiples of a given number less than a specified limit.
	     * 
	     * @param number the number to find multiples of
	     * @param limit the upper bound for the multiples
	     * @return a List of multiples of the number less than the limit
	     */
	    public List<Integer> determineMultiples(int number, int limit) {
	 
	    	// Caso extremo: Si el número es 0 o negativo, o el límite es 0 o menor, devuelve una lista vacía
	        if (number <= 0 || limit <= 0) {
	            return new ArrayList<>();
	        }
	 
	        List<Integer> multiples = new ArrayList<>();
	 
	        // Comenzando desde 1, multiplica el número por cada entero hasta que el producto sea menor que el límite
	        for (int i = 1; i * number < limit; i++) {
	        	// Agrega el producto a la lista
	            multiples.add(i * number);
	        }
	 
	        return multiples;
	    }
	}
}
