package Thread;

class Task1 extends Thread{
	public void run() {//Signature-Firma
		System.out.print("\nTask1 Started");
		
		for(int i =101;i<=199;i++) 
			System.out.print(i + " ");
		
		
		System.out.print("\nTask1 Done");
	}
}

class Task2 implements Runnable{

	@Override
	public void run() {
		System.out.print("\nTask2 Started");
		
		for(int i =201;i<=299;i++) 
			System.out.print(i + " ");
		
		System.out.print("\nTask2 Done");
	}
	
}


public class ThreadBasicRunner {
	public static void main(String[] args) throws InterruptedException {
		//task1 101-199
		System.out.print("\nTask1 Kicked Off");
		Task1 task1 = new Task1();
		task1.setPriority(1);
		task1.start();//task1.run
		
		System.out.print("\nTask2 Kicked Off");
		Task2 task2 = new Task2();
		Thread task2Thread = new Thread(task2);
		task2Thread.setPriority(10);
		task2Thread.start();
		
		//esperar que task1 se complete
		task1.join();
		task2Thread.join();
		
		System.out.print("\nTask3 Kicked Off");	
		//task3
		for(int i =301;i<=399;i++) 
			System.out.print(i + " ");
		
		System.out.print("\nTask3 Done");
		
		System.out.print("\nMain Done");
	}

}
