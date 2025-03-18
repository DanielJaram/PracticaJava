package functional;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Exercise {
	
	public static List<Integer> filterOddNumbers(List<Integer> numbers) {
		// Usando la API de Java Stream para procesar la lista.
		// El método stream() convierte la lista en un Stream.
		return numbers.stream()
				// El método filter() se usa para filtrar elementos de un Stream.
				// En este caso, estamos filtrando los números pares, manteniendo solo aquellos que dan un residuo de 1 cuando se dividen por 2.
				.filter(number -> number % 2 != 0)
				// El método collect() se usa para transformar el resultado en una lista.
				// Collectors.toList() es un Collector que acumula los elementos de entrada en una nueva Lista.
				.collect(Collectors.toList());
	}
	
		 public static List<Integer> getCubesOfFirstNNumbers(int n) {
			// Verificando si el número de entrada es negativo.
			// Si lo es, lanzamos una IllegalArgumentException. 
			 if (n < 0) {
		            throw new IllegalArgumentException("Input cannot be negative");
		    // Generando una secuencia de enteros desde 1 hasta n (inclusive) usando IntStream.range().
		    // Para cada número, calculamos el cubo y los recopilamos en una Lista.}    
		      }
		      return IntStream.range(1, n + 1)
		                .map(e -> e * e * e)
		                .boxed()
		                .collect(Collectors.toList());
		          
		 }
		 public static List<Integer> getCourseNameCharacterCount(List<String> courses) {
			// Verificar si la lista es nula. Si es así, devolver una lista vacía.
			 if (courses == null) {
				    return List.of();
				}
			// Recorrer la lista de cursos con un Stream, obtener la longitud de cada nombre de curso
			// y recopilar estas longitudes en una nueva lista.
			 return courses.stream().map(String::length).collect(Collectors.toList());
		    }
		 
		 public static long sumOfSquares(List<Integer> numbers) {
			// Verificar si la lista es nula. Si es así, devolver 0.
		        if(numbers == null) {
		        	return 0;		        
		        	}
		     // Recorrer la lista de números con un Stream.
		        return numbers.stream()
		        		// Elevar al cuadrado cada número usando la función mapToLong().
		        		.mapToLong(n -> n * n)
		        		// Sumar todos los cuadrados usando la función sum().
		        		.sum();
		    }
		 
		 public static int findMaxEvenNumber(List<Integer> numbers) {
		        if(numbers == null) {
		        	return 0;
		        }
		        return numbers.stream().filter(number -> number%2 ==0).max(Integer::compare).orElse(0);
		    }
		 
		 
		   public static int findMaxEvenNumbers(List<Integer> numbers) {
		        // Check if the list is null. If so, return 0.
		        if (numbers == null) {
		            return 0;
		        }
		        
		        // Stream over the list of numbers, filter out the odd numbers
		        // and find the max even number using the max() function
		        Optional<Integer> maxEven = numbers.stream()
		            .filter(number -> number % 2 == 0)
		            .max(Integer::compare);
		        
		        // Return the max even number. If the list doesn't contain any even numbers,
		        // maxEven will be an empty Optional, so we return 0.
		        return maxEven.orElse(0);
		    }
		 
		    public static void main(String[] args) {
		        List<Integer> numbers = List.of(23, 45, 67, 12, 34, 56, 78);
		        int maxEven = findMaxEvenNumber(numbers);
		        System.out.println("Max even number: " + maxEven);
		    }
    }

