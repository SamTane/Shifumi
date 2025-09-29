package shifoumi;	
import java.util.Scanner;


public class shifumi {

	public static void main(String[] args) {
		// Début du code
		Scanner scanner = new Scanner(System.in); // Permet de scanner les infos de l'utilisateur dans toute la suite du code. 
		
		
		//Début Boucle nombre de Points
		int nombrePoints; // Initialisation variable
		do {
			System.out.println("Entrez 3, 5 ou 10 pour le nombre de points :");
			nombrePoints = scanner.nextInt();
			// Affichage de texte puis Lire l'entrée de l'utilisateur (ici int, un entier)
		} while (nombrePoints != 3 && nombrePoints != 5 && nombrePoints != 10);
		System.out.println("OK"); 
		
		
		//Début Boucle Pierre Feuille Ciseau
		char choixJoueur; //Initialisation variable
		do {
			System.out.println("Entrez P, F ou C.");
		    choixJoueur = scanner.next().charAt(0);
		} while (choixJoueur != 'P' && choixJoueur != 'F' && choixJoueur != 'C');
		System.out.println("OK"); 

		
		//Choix ordinateur 
		int nombreAleatoire; 
		char choixOrdinateur = ' ';
		// initialisation des variables
		nombreAleatoire = (int)(Math.random()*3)+1;  // Nombre aléatoire entre 1 et 3
		if (nombreAleatoire == 1) {
			choixOrdinateur = 'F';
		} // si 1, l'ordinateur choisi F
		else if (nombreAleatoire == 2) {
			choixOrdinateur = 'P';
		} // si 2, l'ordinateur choisi P
		else {
			choixOrdinateur = 'C';
		} // sinon, l'ordinateur choisi C
		System.out.println("Le choix de l'ordinateur est... ");
		try {
		Thread.sleep(1000); // suspens de 1000 ms, ou une seconde
		} catch (InterruptedException e) {
			e.printStackTrace(); // try catch permet de continuer le programme en cas de problème de la fonction thread
		}
		System.out.println(choixOrdinateur);
		
		
		//Résultat et attribution des points		
		int scoreJoueur = 0;
		int scoreOrdinateur = 0;
		//Initialisation des variables	
		if (choixJoueur == choixOrdinateur) {
			System.out.println("Égalité !"); 
			// Si les choix de l'ordinateur et du joueur sont les mêmes, pas de changement de points
		} else if ((choixJoueur == 'F' && choixOrdinateur == 'P') ||
				  (choixJoueur == 'P' && choixOrdinateur == 'C') ||
				  (choixJoueur == 'C' && choixOrdinateur == 'F')) {
			System.out.println("Vous avez gagné !");
			scoreJoueur = scoreJoueur + 1;
			//Les 3 possibilités où le joueur gagne
		} else {
			System.out.println("Vous avez perdu...");
			scoreOrdinateur = scoreOrdinateur + 1;
			// Si si ce n'est ni une victoire du joueur, ni une égalité, il s'agit forcément d'une victoire de l'ordinateur.
		}
		System.out.println(" Score: " + scoreJoueur +  " - " + scoreOrdinateur);
		
	}
}
	
