import java.util.Scanner;

 /**
 * 
 * Exercice 2.3
 * Conversion Celsius-Fahrenheit
 * 
 * Convertit des températures entre les degrés Celsius
 * et les degrés Fahrenheit.
 * 
 */
public class Temperature {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int choix;
		double tempC, tempF;
		
		
		// Choix
		System.out.print("Convertir de...\n"
			+ "1 - Celsius vers Fahrenheit\n"
			+ "2 - Fahrenheit vers Celsius\n\n"
			+ "Votre choix : ");
			
		choix = sc.nextInt();
		
		if(choix == 1) {
			
			System.out.print("Température (°C) : ");
			tempC = sc.nextDouble();
			
			tempF = (9.0 / 5.0) * tempC + 32.0;
			
			System.out.println("La température équivalente est " + tempF + "°F.");
			
		}
		else if(choix == 2) {
			
			System.out.print("Température (°F) : ");
			tempF = sc.nextDouble();
			
			tempC = (5.0 / 9.0) * (tempF - 32.0);
			
			System.out.println("La température équivalente est " + tempC + "°C.");
			
		}
		else {
			System.out.println("Votre choix est incorrect.");
		}
		

	}

}
