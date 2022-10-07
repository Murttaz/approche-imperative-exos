package fr.algorithmie;

import java.util.Scanner;

import org.junit.Test;
import org.junit.runner.RunWith;

import outils.Exercice;
import outils.ExerciceRunner;
import outils.Question;
import outils.Resultat;

/**
 * Ne modifiez ni les noms des classes, ni les noms des méthodes.
 * Utilisez Resultat.log pour afficher les résultats
 * 
 * @author DIGINAMIC
 *
 */
@RunWith(ExerciceRunner.class)
@Exercice(nom="InteractifTableMult")
public class Ex17_InteractifTableMult {
	
	/**
	 * Ne pas modifier les informations portées par l'annotation. 
	 */
	@Test
	@Question(numero = 1)
	public void interactif() {
		
		Scanner scanner = new Scanner(System.in) ;
		boolean arret = false;
		int chiffre=0;
		do {
			System.out.println("Saisissez un nombre :");
			chiffre=scanner.nextInt();
			if (chiffre >= 1 && chiffre <= 10) {
				arret = true;
			}
			/*else {
				System.out.println("Veuillez ressaisir un nombre :");
				chiffre=scanner.nextInt();
			}*/
		
		}
		while(!arret);
		
		System.out.println("Table de " + chiffre + " :");
		for (int i = 1; i <= 10; i++) {
			Resultat.log(chiffre + "*" + i + "=" + (chiffre * i));
		}
		// TODO Tant que le nombre saisi par l'utilisateur n'est pas compris
		// entre 1 et 10 l'application continue à demander un nombre à l'utilisateur.
		
		// Si ce nombre est compris entre 1 et 10, l'application affiche la table de multiplication
		// de ce nombre sous la forme : 3*1=3, 3*2=6, etc... jusqu'à 3*2=10
		
		scanner.close();
	}

}
