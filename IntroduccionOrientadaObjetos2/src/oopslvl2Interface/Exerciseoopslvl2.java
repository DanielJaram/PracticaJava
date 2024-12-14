package oopslvl2Interface;

public class Exerciseoopslvl2 {
	// Define una interfaz para las operaciones que se pueden realizar
	interface Operation {
	    // El método perform debe tomar dos enteros como argumentos y devolver un entero
	    int perform(int x, int y);
	}
	 
	// Una clase que realiza sumas implementando la interfaz Operation
	class Add implements Operation {
	    // El método perform suma los dos argumentos y devuelve el resultado
	    @Override
	    public int perform(int x, int y) {
	        return x + y;
	    }
	}
	 
	//Una clase que realiza restas implementando la interfaz Operation
	class Subtract implements Operation {
	    // El método perform resta el segundo argumento del primero y devuelve el resultado
	    @Override
	    public int perform(int x, int y) {
	        return x - y;
	    }
	}
	 
	// Una clase que realiza divisiones implementando la interfaz Operation
	class Divide implements Operation {
	    @Override
	    public int perform(int x, int y) {
	        // Si el segundo argumento es cero, devuelve -1 para indicar un error
	        if (y == 0) {
	            return -1;
	        }
	        
	        // De lo contrario, realiza la división
	        return x / y;
	    }
	}
}
