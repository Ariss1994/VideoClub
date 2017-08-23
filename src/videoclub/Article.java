package videoclub;

import java.util.ArrayList;
/**
 *  @author Ahmad El-Ariss 1008651
 * @author Jean Emmanuel Charles 1065027
 * @author CHAHID NEZHA p1060244
 * @version 1.0
 * @since 31 Mars 2014
 * @author Ahmad
 *
 */
public class Article {

	private String titre;
	private String dateSortie;
	private boolean enStock;
	private ArrayList<String> langue;
	@SuppressWarnings("unused")
	private ArrayList<Film> listeCopies;
	public static ArrayList<Film> film;
	private String dateLocation;
	private String dateRetour;

	/**
	 * Le construcetur par parametres dans lequel on fait appel aux setteurs
	 * pour initialiser quelques attributs de la classe Article.
	 * @param Titre
	 * @param date
	 * @param location
	 * @param retour
	 * @param Stock
	 */
	public Article(String Titre, String date, String location, String retour, boolean Stock) {
		// TODO Auto-generated constructor stub
		titre = Titre;
		dateSortie = date;
		dateLocation = location;
		dateRetour = retour;
		langue = new ArrayList<>();
		listeCopies = new ArrayList<>();
		film = new ArrayList<>();
		enStock = Stock;
	}

	/**
	 * @return le titre d'un Article
	 */
	public String getTitre() {
		return titre;
	}

	/**
	 * @param titre
	 *            the titre d'un Article
	 */
	public void setTitre(String titre) {
		this.titre = titre;
	}

	/**
	 * @return la date de Sortie
	 */
	public String getDateSortie() {
		return dateSortie;
	}

	/**
	 * @param dateSortie
	 *            modifier la date de sortie
	 */
	public void setDateSortie(String dateSortie) {
		this.dateSortie = dateSortie;
	}

	/**
	 * @return the enStock
	 */
	public boolean isEnStock() {
		return enStock;
	}

	/**
	 * @param enStock
	 *            modifie le Stock
	 */
	public void setEnStock(boolean enStock) {
		this.enStock = enStock;
	}

	/**
	 * @return la langue 
	 */
	public ArrayList<String> getLangue() {
		return langue;
	}

	/**
	 * @param langue
	 *            modifie la langue
	 */
	public void setLangue(ArrayList<String> langue) {
		this.langue = langue;
	}

	/**
	 * @return the date de Location
	 */
	public String getDateLocation() {
		return dateLocation;
	}

	/**
	 * @param dateLocation
	 *           modifie la date de location
	 */
	public void setDateLocation(String dateLocation) {
		this.dateLocation = dateLocation;
	}

	/**
	 * @return the date de Retour
	 */
	public String getDateRetour() {
		return dateRetour;
	}

	/**
	 * @param dateRetour
	 *            modifie la date de Retour
	 */
	public void setDateRetour(String dateRetour) {
		this.dateRetour = dateRetour;
	}

	public static ArrayList<Film> getFilm() {
		return film;
	}

	public static void setFilm(ArrayList<Film> film) {
		Article.film = film;
	}

}
