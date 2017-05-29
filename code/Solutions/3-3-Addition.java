import java.util.Scanner;

/**
 * Effectue l'addition de deux ou trois nombres.
 * 
 * @author Etienne
 */
public class Addition {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int choix;
		
		//Choix
		System.out.print("Voulez-vous additionner 2 ou 3 nombres? ");
		choix = sc.nextInt();
		
		
		if(choix == 2) {
			
			double n1, n2;
			
			System.out.print("Nombre 1 : ");
			n1 = sc.nextDouble();
			
			System.out.print("Nombre 2 : ");
			n2 = sc.nextDouble();
			
			System.out.println("Résultat : " + addition(n1, n2));
			
		}
		else if(choix == 3) {
			
			double n1, n2, n3;
			
			System.out.print("Nombre 1 : ");
			n1 = sc.nextDouble();
			
			System.out.print("Nombre 2 : ");
			n2 = sc.nextDouble();
			
			System.out.print("Nombre 3 : ");
			n3 = sc.nextDouble();
			
			System.out.println("Résultat : " + addition(n1, n2, n3));
			
		}
		else { //Autre choix
			System.out.println("Pas supporté pour le moment.");
		}
		

	}
	
	
	/**
	 * Addition de deux nombres.
	 * @param a Premier nombre.
	 * @param b Deuxième nombre.
	 * @return Somme.
	 */
	public static double addition(double a, double b) {
		return a + b;
	}
	
	
	/**
	 * Addition de trois nombres.
	 * @param a Premier nombre.
	 * @param b Deuxième nombre.
	 * @param c Troisième nombre.
	 * @return Somme.
	 */
	public static double addition(double a, double b, double c) {
		return a + b + c;
	}

}
