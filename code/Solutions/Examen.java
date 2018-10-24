import java.util.Scanner;

/**
 * 
 * Exercice 2.1
 * Résultats à l'examen
 * 
 * Affichage d'un message selon la note de l'utilisateur.
 * 
 */
public class Examen {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int note;
		
		// Obtention de la note
		System.out.print("Saisissez votre note : ");
		note = scanner.nextInt();
		
		// Message
		if(note == 100)
			System.out.println("Wow! C'est une note parfaite!");
		
		else if(note >= 60 && note < 100)
			System.out.println("Vous avez réussi l'examen.");
		
		else if(note >= 0 && note < 60)
			System.out.println("Vous n'avez pas réussi l'examen.");
		
		else
			System.out.println("Résultat impossible.");
		
	}

}
