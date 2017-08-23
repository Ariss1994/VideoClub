/**
 * 
 */
package videoclub;

import java.util.ArrayList;

/**
 * @author Ahmad El-Ariss 1008651
 * @author Jean Emmanuel Charles 1065027
 * @author CHAHID NEZHA p1060244
 * @version 1.0
 * @since 31 Mars 2014
 * 
 */
public class Jeu extends Article {

	private String editeur;
	private String developeur;
	private String categorie;
	private static int dernierNumero = 0;
	public static ArrayList<Jeu> jeu;
	@SuppressWarnings("unused")
	private int numero;

	/**
	 * Le construcetur par parametres dans lequel on fait appel aux setteurs
	 * pour initialiser quelques attributs de la classe Jeu.
	 * 
	 * @param Titre
	 * @param date
	 * @param location
	 * @param retour
	 * @param Stock
	 */
	public Jeu(String Titre, String date, String location, String retour,
			boolean Stock, String Editeur, String Developeur, String Categorie) {
		super(Titre, date, location, retour, Stock);
		editeur = Editeur;
		developeur = Developeur;
		categorie = Categorie;
		countCass_Num();
		jeu = new ArrayList<>();

		this.numero = dernierNumero;

		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the editeur du Jeu
	 */
	public String getEditeur() {
		return editeur;
	}

	/**
	 * @param editeur
	 *            modifie l'editeur du Jeu
	 */
	public void setEditeur(String editeur) {
		this.editeur = editeur;
	}

	/**
	 * @return the developpeur du Jeu
	 */
	public String getDevelopeur() {
		return developeur;
	}

	/**
	 * @param developpeur
	 *            modifie le developeur
	 */
	public void setDevelopeur(String developeur) {
		this.developeur = developeur;
	}

	/**
	 * @return the categorie du Jeu
	 */
	public String getCategorie() {
		return categorie;
	}

	/**
	 * @param categorie
	 *            modifie categorie 
	 */
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	/**
	 * incrimante dernierNumero de 1
	 * 
	 */
	public static void countCass_Num() {
		dernierNumero = dernierNumero + 1;
	}

	/**
	 * ajoute E a l'ArrayList jeu
	 * @param E
	 */
	public static void addJeu(Jeu E) {
		jeu.add(E);

	}

	/**
	 * modifie un Jeu dans l'ArrayList
	 * @param num
	 * @param nom
	 */
	public static void modifierFilm(int num, String nom) {
		Film film = Article.film.get(num);
		Article.film.set(num, film);

	}

	/**
	 * @return the derniernumero
	 */
	public static int getDerniernumero() {
		return dernierNumero;
	}

	/**
	 * @param derniernumero
	 *           
	 */
	public static void setDerniernumero(int derniernumero) {
		Jeu.dernierNumero = derniernumero;
	}

	@Override
	public String toString() {
		return "Jeu [editeur=" + editeur + ", developeur=" + developeur
				+ ", categorie=" + categorie + "]";
	}
}
