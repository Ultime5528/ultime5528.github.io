import java.util.Scanner;

/**
 * Exercice 1.3 (version 2).
 * 
 * Calcul de la moyenne de 5 nombres.
 * 
 * @author Etienne
 *
 */

public class Moyenne {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double moyenne;  //Somme des entrées, puis moyenne
		
		
		//Saisies des données
		System.out.print("Saisissez le premier nombre : ");
		moyenne = scanner.nextDouble();
		
		System.out.print("Saisissez le deuxième nombre : ");
		moyenne += scanner.nextDouble();
		
		System.out.print("Saisissez le troisième nombre : ");
		moyenne += scanner.nextDouble();
		
		System.out.print("Saisissez le quatrième nombre : ");
		moyenne += scanner.nextDouble();
		
		System.out.print("Saisissez le cinquième nombre : ");
		moyenne += scanner.nextDouble();
		
		
		//Calcul du résultat
		moyenne /= 5.0;
		System.out.println("Moyenne : " + moyenne);
		
	}
	
}
