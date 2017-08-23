package videoclub;

import java.util.ArrayList;

/**
 * 
 * @author Ahmad El-Ariss 1008651
 * @author Jean Emmanuel Charles 1065027
 * @author Wissam Akchich 0870592
 * @version 1.0
 * @since 12 Fevrier 2014
 */

public class Film extends Article {

	private String realisateur;
	private String categorie;
	private int numero;
	final static double prixdelocation = 9.99;
	private static int derniernumero = 0;
	private ArrayList<String> listeActeurs;
	private ArrayList<String> sousTitres;
	public static ArrayList<Film> film;

	/**
	 * * Le 1er construcetur par parametres dans lequel on fait appel aux
	 * setteurs pour initialiser quelques attributs de la classe Adeherent.
	 * 
	 * @param Titre
	 * @param date
	 * @param location
	 * @param retour
	 * @param Langue
	 * @param Stock
	 */
	public Film(String Titre, String date, String location, String retour,
			boolean Stock, String Realisateur, String Categorie) {

		super(Titre, date, location, retour, Stock);
		countCass_Num();
		realisateur = Realisateur;
		listeActeurs = new ArrayList<>();
		sousTitres = new ArrayList<>();

		film = new ArrayList<>();

		this.numero = derniernumero;
	}

	/**
	 * 
	 * @param nombre
	 *            modifie le nombre du Film
	 */
	public static void setDerniernum(int nombre) {
		derniernumero = nombre;
	}

	/**
	 * incrimante le derninernumero de 1
	 * 
	 */
	public static void countCass_Num() {
		derniernumero = derniernumero + 1;
	}

	/**
	 * @return the realisateur du Film
	 */
	public String getRealisateur() {
		return realisateur;
	}

	/**
	 * @param realisateur
	 *            modifie realisateur
	 */
	public void setRealisateur(String realisateur) {
		this.realisateur = realisateur;
	}

	/**
	 * @return the categorie du Film
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
	 * @return the numero du Film
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * 
	 * retourne derniernumero du Film
	 */
	public static int getDerniernum() {
		return derniernumero;

	}

	/**
	 * 
	 * @param numero
	 * modifie le numero du Film
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * @return the listeActeurs
	 */
	public ArrayList<String> getListeActeurs() {
		return listeActeurs;
	}

	/**
	 * @param listeActeurs
	 *            modifie listeActeurs
	 */
	public void setListeActeurs(ArrayList<String> listeActeurs) {
		this.listeActeurs = listeActeurs;
	}

	/**
	 * @return the sousTitres
	 */
	public ArrayList<String> getSousTitres() {
		return sousTitres;
	}

	/**
	 * @param sousTitres
	 *            les sousTitres d'un Film
	 */
	public void setSousTitres(ArrayList<String> sousTitres) {
		this.sousTitres = sousTitres;
	}

	/**
	 * 
	 * @param E
	 * ajoute E a l'ArrayList film
	 */

	public static void addFilm(Film E) {
		film.add(E);

	}
/**
 * modifie un Film
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
		return derniernumero;
	}

	/**
	 * @param derniernumero
	 *            modifie le derniernumero
	 */
	public static void setDerniernumero(int Derniernumero) {
		derniernumero = Derniernumero;
	}

	public static void supprimerFilm(int num) {

		film.set(num, null);
		film.remove(num);
	}

	@SuppressWarnings("unused")
	public static void afficherFilm() {

		for (Film film : Article.film)

			System.out.println(Article.film);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Film [realisateur=" + realisateur + ", categorie=" + categorie
				+ ", numero=" + numero + ", listeActeurs=" + listeActeurs
				+ ", sousTitres=" + sousTitres + "]";
	}

}