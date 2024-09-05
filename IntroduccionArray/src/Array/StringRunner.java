package Array;

public class StringRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] diasDeLaSemana = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		String diaConMasCaracteres = "";
		for (String dia : diasDeLaSemana) {
			if (dia.length() > diaConMasCaracteres.length()) {
				diaConMasCaracteres = dia;
			}
		}

		System.out.println("Dia con mas caracteres: " + diaConMasCaracteres);
		
		//Imprime los dias de la semana en alrevez
		for (int i = diasDeLaSemana.length - 1; i >= 0; i--) {
			System.out.println(diasDeLaSemana[i]);
		}
		//Imprime los dias de la semana
		for(int i = 0; i<diasDeLaSemana.length; i++){ 
			System.out.println(diasDeLaSemana[i]); 

			} 
	}
}
