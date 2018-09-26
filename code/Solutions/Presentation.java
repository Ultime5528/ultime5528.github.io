import java.util.Scanner;

/**
 * 
 * Exercice 1.1
 * Présentation
 * 
 * Demande des informations sur l'utilisateur puis les affiche.
 *
 */
public class Presentation {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// Renseignements de l'utilisateur
		String nom;
		int age;
		double salaire;
		
		
		// Demande les informations
		System.out.print("Saisissez votre nom : ");
		nom = scanner.nextLine();
		
		System.out.print("Saisissez votre âge : ");
		age = scanner.nextInt();
		
		System.out.print("Saisissez votre salaire : ");
		salaire = scanner.nextDouble();
		
		
		// Affichage des informations
		System.out.println("\nBonjour " + nom + "! Vous avez " + age
				+ " ans et votre salaire est de " + salaire + " $ par heure.");

	}

}
