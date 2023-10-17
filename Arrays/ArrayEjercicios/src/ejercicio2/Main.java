package ejercicio2;

public class Main {

	public static void main(String[] args) {
		
		double numAleat[] = new double [10];
		int suma = 0;
		
		for (int i = 0; i < numAleat.length; i++) {
			
			numAleat[i] = Math.random()*100;
			System.out.println((int)numAleat[i]);
			suma += numAleat[i];
		}

		System.out.println("La suma total es " + suma);
	}

}