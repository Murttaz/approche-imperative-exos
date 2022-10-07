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
 * 
 * @author DIGINAMIC
 *
 */
@RunWith(ExerciceRunner.class)
@Exercice(nom="InteractifTantQue")
public class Ex16_InteractifTantQue {
	
	/**
	 * Ne pas modifier les informations portées par l'annotation. 
	 */
	@Test
	@Question(numero = 1)
	public void interactif() {
		
		Scanner scanner = new Scanner(System.in) ;
		
		int Nb=0;
		boolean arrete=false;
		
		do {
			System.out.println("Saisissez un nombre :");
			Nb=scanner.nextInt();
			if (Nb >= 1 && Nb <= 10) {
				arrete = true;
			}
		}
			while (!arrete); 
		Resultat.log(Nb);
		// TODO Tant que le nombre saisi par l'utilisateur n'est pas compris
		// entre 1 et 10 inclus l'application continue à demander un nombre à l'utilisateur.
		// Si ce nombre est compris entre 1 et 10, l'application LOGUE le résultat 
		// et s'arrête.
		
		scanner.close();
	}

}
