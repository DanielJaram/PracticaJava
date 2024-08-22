package oops;

public class MotorBike {
	// state
		private int velocidad;// member vairable

		// behavior
		// method
		// inputs- int speed
		// outputs- void
		// name- setSpeed

		public MotorBike() {
			this(5);
		}
		
		MotorBike(int velocidad){
			this.velocidad = velocidad;
		}
		void start() {
			System.out.println("Motocicleta arranco");
		}
		
		public void incrementarVelocidad(int howMuch) {
			setVelocidad(this.velocidad + howMuch);
		}
		
		public void disminuirVelocidad(int howMuch) {
			setVelocidad( this.velocidad - howMuch);
			
		}

		public int getVelocidad() {
			return velocidad;
		}

		public void setVelocidad(int velocidad) {
			if(velocidad > 0) {
				this.velocidad = velocidad;
			}
		}
	}

