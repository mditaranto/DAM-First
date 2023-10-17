package ejercicio1;

public class Main {

	public static void main(String[] args) {
		
		double numAleat[] = new double [10];
		
		for (int i = 0; i < numAleat.length; i++) {
			
			numAleat[i] = Math.random()*100;
			System.out.println((int)numAleat[i]);
		}

	}

}
