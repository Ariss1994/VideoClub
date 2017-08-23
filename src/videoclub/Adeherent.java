package videoclub;

import java.util.ArrayList;
import java.util.Arrays;

/**
 @author Ahmad El-Ariss 1008651
 * @author Jean Emmanuel Charles 1065027
 * @author CHAHID NEZHA p1060244
 * @version 1.0
 * @since 31 Mars 2014
 */
public class Adeherent extends Personne {
	private static int derniernum = -1;

	public static int adhNum;
	private int adh_NbEmprunts;

	@SuppressWarnings("unused")
	private ArrayList<String> listFilm;
	@SuppressWarnings("unused")
	private ArrayList<String> listJeu;
	public static ArrayList<Adeherent> adeherent;

	/**
	 * Le construcetur par parametres dans lequel on fait appel aux setteurs
	 * pour initialiser quelques attributs de la classe Adeherent.
	 * 
	 * @param sex
	 * @param nom
	 * @param prenom
	 * @param age
	 * @param nationalite
	 * @param adresse
	 */

	public Adeherent(String sex, String nom, String prenom, int age,
			String nationalite, String adresse) {
		super(sex, nom, prenom, age, nationalite, adresse);
		// TODO Auto-generated constructor stub
		this.sex = sex;
		this.nom = nom;
		this.age = age;
		this.nationalite = nationalite;
		this.adresse = adresse;
		listFilm = new ArrayList<>();
		listJeu = new ArrayList<>();
		adeherent = new ArrayList<>();
		countAdh_Num();
		Adeherent.adhNum = derniernum;

	}

	/**
	 * Le construcetur par parametres dans lequel on fait appel aux setteurs
	 * pour initialiser quelques attributs de la classe Adeherent.
	 * 
	 * @param num
	 * @param sex
	 * @param nom
	 * @param prenom
	 * @param age
	 * @param nationalite
	 * @param adresse
	 */

	public Adeherent(int num, String sex, String nom, String prenom, int age,
			String nationalite, String adresse) {
		super(sex, nom, prenom, age, nationalite, adresse);
		// TODO Auto-generated constructor stub
		this.sex = sex;
		this.nom = nom;
		this.age = age;
		this.nationalite = nationalite;
		this.adresse = adresse;
		listFilm = new ArrayList<>();
		listJeu = new ArrayList<>();
		adeherent = new ArrayList<>();

		Adeherent.adhNum = num;

	}

	
	/**
	 * Incrimante le derniernum par 1
	 */
	public static void countAdh_Num() {
		derniernum = derniernum + 1;
	}

	/**
	 *
	 * @return le numero de l'Adeherent
	 */
	public int getNombre() {
		return adhNum;

	}
	/**
	 * 
	 * @return le dernier numero d'un Adeherent
	 */

	public static int getDerniernum() {
		return derniernum;

	}
	
	/**
	 * retounr le nom de l'Adeherent
	 */

	public String getNom() {
		return this.nom;
	}
	
	/**
	 * 
	 * @param Emprunts
	 * modifie le nombre d'emprunts de l'Adeherent
	 */

	public void setEmprunts(int Emprunts) {
		this.adh_NbEmprunts = Emprunts;
	}

	/**
	 * 
	 * @return le nombre d'emprunts
	 */
	public int getNombredEmprunts() {
		return this.adh_NbEmprunts;
	}

	/**
	 * 
	 * @param nombre
	 * modifie le numbero de l'Adeherent
	 */
	public void setNombre(int nombre) {
		adhNum = nombre;
	}
	
	/**
	 * 
	 * @param nombre
	 * modifie le dernier numero de l'Adeherent
	 */

	public static void setDerniernum(int nombre) {
		derniernum = nombre;
	}

	/**
	 * modifie le nom de l'Adeherent
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * methode qui modifier un Adeherent
	 * 
	 * @param Nom
	 * @param num
	 * @param adeherent
	 */
	public static void modifierAdeherent(String Nom, int num,
			Adeherent[] adeherent) {

		if (derniernum == -1)
			System.out.println("L'adherent n'existe pas");
		if (derniernum == 0 && adeherent[0] != null)
			adeherent[0].setNom(Nom);
		if (derniernum >= 1) {
			for (int j = 0; j < derniernum; j++) {
				if (adeherent[j] != null && adeherent[j].getNombre() == num)
					;
				adeherent[j].setNom(Nom);

			}
		} else
			System.out.println("L'adherent n'existe pas");
	}

	/*
	 * public void AjouterAdeherent( Adeherent[] adeherent) { //
	 * System.out.println(adh_Num_temp);
	 * 
	 * adeherent[ adhNum] = e; }
	 */
	
	/**
	 * methode qui supprime un Adeherent
	 * @param adh_Num
	 * @param adeherent
	 */

	public static void suprimerAdeherent(int adh_Num, Adeherent[] adeherent) {

		adeherent[adh_Num - 1] = null;

	}

	/**
	 * methode qui affiche la liste des Adeherents
	 * @param adeherent
	 */
	public static void AfficherListe1(Adeherent[] adeherent) {
		System.out.println("liste des adherent disponible");
		for (int i = 0; i < adeherent.length; i++)
			if (adeherent[i] != null)
				System.out.println("numero: " + adeherent[i].getNombre()
						+ "  sex  :" + adeherent[i].sex + "  nom  :"
						+ adeherent[i].getNom() + "  Prenom  :"
						+ adeherent[i].getPrenom() + "  Age :"
						+ adeherent[i].getAge() + "  Nationatité  :"
						+ adeherent[i].getNationalite() + "  Adresse  :"
						+ adeherent[i].getAdresse());
	}

	/**
	 * Affichage des Adeherents en ordre alphabetique
	 * @param adeherent
	 */
	public void AfficherListe(Adeherent[] adeherent) {

		String[] v = new String[adhNum];
		for (int i = 0; i < adeherent.length; i++) {
			if (adeherent[i] != null)
				v[i] = adeherent[i].getNom();

		}
		String[] v1 = new String[adhNum];

		for (int i = 0; i < v1.length; i++) {
			if (v[i] != null)
				v1[i] = v[i];
			else
				v1[i] = "";

		}

		Arrays.sort(v1);
		for (int i = 0; i < v1.length; i++) {
			System.out.println(v1[i]);

		}

	}

	/**
	 * Ajoute un Adeherent à l'ArrayList adeherent
	 * @param E
	 */
	public static void addAdeherent(Adeherent E) {
		adeherent.add(E);

	}

	/**
	 * modifie un Adeherent
	 * @param num
	 * @param nom
	 */
	public static void modifierAdeherent(int num, String nom) {
		// System.out.println("modifierAdeherent1" + num );

		Adeherent ade = adeherent.get(num);
		// System.out.println("modifierAdeherent 2" + adeherent);
		ade.setNom(nom);

	}

	/**
	 * Supprime un Adeherent
	 * @param adhnum
	 */
	public static void supprimerAdeherent(int adhnum) {

		adeherent.set(adhnum, null);
		adeherent.remove(adhnum);
	}

	public static void afficherAdeherent() {

		for (Adeherent ade : adeherent)

			System.out.println(ade);
	}

	@Override
	public String toString() {
		return "Adeherent [adhNum=" + adhNum + ", sex=" + sex + ", nom=" + nom
				+ ", prenom=" + prenom + ", age=" + age + ", nationalite="
				+ nationalite + ", adresse=" + adresse + "]";
	}

}
