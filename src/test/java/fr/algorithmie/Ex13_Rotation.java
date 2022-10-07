package fr.algorithmie;

import javax.swing.text.TabableView;

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
@Exercice(nom="Rotation")
public class Ex13_Rotation {

	// NE PAS CHANGER LES NOMS
	// mais vous pouvez modifier les valeurs contenues dans array
	int[] array = { 0, 1, 2, 3};

	/**
	 * Ne pas modifier les informations portées par l'annotation. 
	 */
	@Test
	@Question(numero = 1)
	public void afficherAlgo() {
		int bumper=array[array.length-1];
		for (int i = array.length - 2; i >= 0; i--) {
			array[i + 1] = array[i];
		}
		array[0]=bumper;
		
		for (int val : array) { //trouvé sur stack overflow
		Resultat.log(val);
		}
		// TODO Effectuez une rotation à droite des éléments du tableau array
		// Exemple : si le tableau contient {0,1,2,3} alors il contiendra {3,0,1,2}
		// après rotation
		
		// TODO Afficher le contenu du tableau après rotation avec Resultat.log
	}

}
