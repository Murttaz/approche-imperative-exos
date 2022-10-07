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
@Exercice(nom="InteractifPlusGrand")
public class Ex18_InteractifPlusGrand {
	
	/**
	 * Ne pas modifier les informations portées par l'annotation. 
	 */
	@Test
	@Question(numero = 1)
	public void interactif() {
		
		Scanner scanner = new Scanner(System.in) ;
		
		int nombre = 0;
		int []tab= new int[10];
		for (int i=0;i<tab.length;i++) {
			System.out.println("saisissez un nombre :");
			nombre=scanner.nextInt();
			tab[i]=nombre;
			Resultat.log(tab[i]);
		}
		
		int max=0;
		for (int j=0;j<tab.length;j++) {
			if (tab[j]>max) {
				max=tab[j];
			}
		}
		Resultat.log(max);
		// TODO Demander à l'utilisateur de saisir 10 nombres entiers
		// TODO Affichez chaque nombre saisi avec Resultat.log
		// TODO Enfin affichez avec Resultat.log le max des 10 nombres
	
		
		scanner.close();
	}

}
