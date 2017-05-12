import java.util.Scanner;

/**
 * Exercice 1.3 (version 1)
 * 
 * Calcul de la moyenne de 5 nombres.
 * 
 * @author Etienne
 *
 */

public class Moyenne {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double nbre1, nbre2, nbre3, nbre4, nbre5;
		double moyenne;
		
		
		//Saisies des données
		System.out.print("Saisissez le premier nombre : ");
		nbre1 = scanner.nextDouble();
		
		System.out.print("Saisissez le deuxième nombre : ");
		nbre2 = scanner.nextDouble();
		
		System.out.print("Saisissez le troisième nombre : ");
		nbre3 = scanner.nextDouble();
		
		System.out.print("Saisissez le quatrième nombre : ");
		nbre4 = scanner.nextDouble();
		
		System.out.print("Saisissez le cinquième nombre : ");
		nbre5 = scanner.nextDouble();
		
		
		//Calcul du résultat
		moyenne = (nbre1 + nbre2 + nbre3 + nbre4 + nbre5) / 5.0;
		System.out.println("Moyenne : " + moyenne);
		
	}
	
}
