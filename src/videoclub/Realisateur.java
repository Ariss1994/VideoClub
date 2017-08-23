package videoclub;

import java.util.ArrayList;
/**
 *  @author Ahmad El-Ariss 1008651
 * @author Jean Emmanuel Charles 1065027
 * @author CHAHID NEZHA p1060244
 * @version 1.0
 * @since 31 Mars 2014
 *
 */

public class Realisateur extends Personne {
	private ArrayList<String>  listeFilmRealiser;

	
	/**
	 *  Le construcetur par parametres dans lequel on fait appel aux setteurs
	 * pour initialiser quelques attributs de la classe Realisateur.
	 * 
	 * @param sex
	 * @param nom
	 * @param prenom
	 * @param age
	 * @param nationalite
	 * @param adresse
	 */
	public Realisateur(String sex, String nom, String prenom, int age,
			String nationalite, String adresse) {
		super(sex, nom, prenom, age, nationalite, adresse);
		
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return 
	 * @return the listeFilmRealiser
	 */
	public  ArrayList<String> getListeFilmRealiser() {
		return listeFilmRealiser;
	}

/**
 * 
 * @param listeFilmRealiser
 * modifie listeFilmRealiser
 */
	public void setListeFilmRealiser(ArrayList<String> listeFilmRealiser) {
		this.listeFilmRealiser = listeFilmRealiser;
	}


	
}