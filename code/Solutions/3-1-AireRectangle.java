import java.util.Scanner;

/**
 * Calcul de l'aire d'un rectangle à l'aide d'une méthode.
 * 
 * @author Etienne
 */
public class AireRectangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double largeur, longueur, aire;
		
		//Obtention des longueurs
		System.out.print("Largeur du rectangle : ");
		largeur = sc.nextDouble();
		
		System.out.print("Longueur du rectangle : ");
		longueur = sc.nextDouble();
		
		
		//Calcul et affichage
		aire = aireRectangle(largeur, longueur);
		System.out.println("Aire : " + aire);

	}
	
	
	/**
	 * Calcule l'aire d'un rectangle.
	 * @param largeur Largeur du rectangle.
	 * @param longueur Longueur du rectangle.
	 * @return Aire du rectangle.
	 */
	public static double aireRectangle(double base, double hauteur) {
		
		return base * hauteur;
		
	}

}
