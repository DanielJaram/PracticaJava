package ExercisesC;

public class WhileNumberPlayer {
	
	private int limit;

	public WhileNumberPlayer(int limit) {
		this.limit = limit;
	}
	// For limit = 30, outpud would be 1 4 9 16 25 
	public void printSquaresUpToLimit() {
		int i = 1;
		while(i * i < limit){
			System.out.print(i * i + " ");
			i++;
		}
		//para que se pueda imprimir saltando una linea entre ambos metodos
		System.out.println();
	}

	// For limit = 30, outpud would be 1 8 27
	public void printCubesUpToLimit() {
		int i = 1;
		while (i * i * i <= limit) {
			System.out.print(i * i * i + " ");
			i++;
		}
		System.out.println();
	}	
	
}
