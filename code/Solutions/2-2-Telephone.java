import java.util.Scanner;

/**
 * Calcule la facture de la compagnie de téléphone.
 * 
 * @author Etienne
 */
public class Telephone {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double minutes, prix;
		
		final double MONTANT_INITIAL = 10.0;
		final double PREMIER_TAUX = 0.2;
		final double DEUXIEME_TAUX = 0.1;
		final double NB_MINUTES_LIMITE = 30;
		
		
		//Obtention du nombre de minutes
		System.out.print("Saisissez le nombre de minutes : ");
		minutes = scanner.nextDouble();
		
		
		//Calcul
		
		prix = MONTANT_INITIAL;
		
		if(minutes <= NB_MINUTES_LIMITE)
			prix += minutes * PREMIER_TAUX;
		else
			prix += NB_MINUTES_LIMITE * PREMIER_TAUX + (minutes - NB_MINUTES_LIMITE) * DEUXIEME_TAUX;
		
		
		//Affichage du résultat
		System.out.println("Prix à payer : " + prix + " $");

	}

}
