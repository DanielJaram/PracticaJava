package oops;

public class MotorBikeRunner {

	public static void main(String[] args) {
		MotorBike ducati = new MotorBike(100);
		MotorBike honda = new MotorBike(200);
		MotorBike suzuki = new MotorBike();
		
		System.out.println(ducati.getVelocidad());
		System.out.println(honda.getVelocidad());
		System.out.println(suzuki.getVelocidad());
		
		ducati.start();
		honda.start();
		
		ducati.setVelocidad(100);
		
		ducati.incrementarVelocidad(100);
		honda.incrementarVelocidad(100);
		
		ducati.disminuirVelocidad(50);
		honda.disminuirVelocidad(50);
		
		
		//int ducatiVelocidad = ducati.getVelocidad();//get ducati speed
		//ducatiVelocidad += 100;//increase it by 100
		//ducati.setVelocidad(ducatiVelocidad);//set it to ducati
		
		System.out.println(ducati.getVelocidad());
		
		//int hondaVelocidad = honda.getVelocidad();get honda speed
		//hondaVelocidad += 100;increase it by 100
		//honda.setVelocidad(hondaVelocidad);set it to honda
		
		System.out.println(honda.getVelocidad());
		//honda.setVelocidad(80);
		//System.out.println(honda.getVelocidad());
	
	}
}

