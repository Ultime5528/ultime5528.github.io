import java.util.Scanner;

/**
 * Convertit des températures entre les degrés Celsius
 * et les degrés Fahrenheit.
 * 
 * @author Etienne
 *
 */
public class Temperature {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char choix;
		double tempC, tempF;
		
		
		//Choix
		System.out.println("Écrire C pour Celsius->Fahrenheit, ou F pour Fahrenheit->Celsius : ");
		choix = sc.nextLine().toLowerCase().charAt(0);
		
		if(choix == 'c') {
			
			System.out.print("Température (°C) : ");
			tempC = sc.nextDouble();
			
			tempF = (9.0 / 5.0) * tempC + 32.0;
			
			System.out.println("Température (°F) : " + tempF);
			
		}
		else if(choix == 'f') {
			
			System.out.print("Température (°F) : ");
			tempF = sc.nextDouble();
			
			tempC = (5.0 / 9.0) * (tempF - 32.0);
			
			System.out.println("Température (°C) : " + tempC);
			
		}
		else {
			System.out.println("Votre choix est incorrect.");
		}
		

	}

}
