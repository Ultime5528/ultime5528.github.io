import java.util.Scanner;

/**
 * Effectue une division à l'aide de la méthode division.
 * 
 * @author Etienne
 *
 */
public class Division {

	public static void main(String[] args) {
		
		//Exemples :
		division(5.0, 2.0);
		division(2.0, -12.0);
		
		Scanner sc = new Scanner(System.in);
		double dividende, diviseur;
		
		System.out.print("Dividende : ");
		dividende = sc.nextDouble();
		
		System.out.print("Diviseur : ");
		diviseur = sc.nextDouble();
		
		division(dividende, diviseur);

	}
	
	/**
	 * Effectue une division puis affiche l'opération.
	 * Vérifie la division par zéro.
	 * @param num
	 * @param div
	 */
	public static void division(double num, double div) {
		
		if(div != 0.0) {
			
			System.out.println(num + " / " + div + " = " + (num / div));
			
		}
		else {
			
			System.out.println("Erreur! Division par zéro!");
			
		}
		
	}

}
