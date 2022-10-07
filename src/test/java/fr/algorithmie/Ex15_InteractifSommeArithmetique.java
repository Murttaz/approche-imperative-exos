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
@Exercice(nom="InteractifSommeArithmetique")
public class Ex15_InteractifSommeArithmetique {
	
	/**
	 * Ne pas modifier les informations portées par l'annotation. 
	 */
	@Test
	@Question(numero = 1)
	public void interactif() {
		
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Veuillez saisir un nombre : ");
		// TODO Demandez un nombre à l'utilisateur puis LOGUEZ ce nombre 
		// avec Resultat.log
		int nb = scanner.nextInt();
		Resultat.log(nb);
		
		// TODO LOGUEZ avec Resultat.log la somme de 1 à ce nombre inclus
		int sommeNb=0;
		
		for (int i = 1; i <= nb; i++) {
			sommeNb += i;
		}
		
		Resultat.log(sommeNb);
		scanner.close();
	}

}
