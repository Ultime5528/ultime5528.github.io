import java.util.Scanner;

/**
 * 
 * Exercice 1.2
 * AireRectangle
 * 
 * Calcul de l'aire d'un rectangle.
 * 
 */
public class AireRectangle {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double hauteur, largeur, aire;
		
		
		// Données de l'utilisateur
		System.out.print("Hauteur du rectangle : ");
		hauteur = scanner.nextDouble();
		
		System.out.print("Largeur du rectangle : ");
		largeur = scanner.nextDouble();
		
		
		// Calcul de l'aire
		aire = hauteur * largeur;
		
		
		// Affichage de l'aire
		System.out.println("\nLe rectangle a une aire de " + aire + " unités carrées.");

	}

}
