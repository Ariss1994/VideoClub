package videoclub;

import java.util.ArrayList;

/**
 * @author Ahmad El-Ariss 1008651
 * @author Jean Emmanuel Charles 1065027
 * @author CHAHID NEZHA p1060244
 * @version 1.0
 * @since 31 Mars 2014
 * 
 * 
 */

public class Employe extends Personne {
	public static int[] motPasse;
	private static int dernierNum = -1;
	private int EmpNum;
	private int motDePasse;
	private double salaire;
	private String dateEmbauche;
	public static ArrayList<Employe> employes;

	/**
	 * * Le 1er construcetur par parametres dans lequel on fait appel aux
	 * setteurs pour initialiser quelques attributs de la classe Employe.
	 * 
	 * @param sex
	 * @param nom
	 * @param prenom
	 * @param age
	 * @param nationalite
	 * @param adresse
	 */

	public Employe(String sex, String nom, String prenom, int age,
			String nationalite, String adresse, int MotDePasse, double salaire,
			String dateEmbauche) {
		super(sex, nom, prenom, age, nationalite, adresse);

		this.sex = sex;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.nationalite = nationalite;
		this.adresse = adresse;
		motDePasse = MotDePasse;
		// motPasse[dernierNum]=motDePasse;
		this.salaire = salaire;
		this.dateEmbauche = dateEmbauche;
		employes = new ArrayList<>();
		dernierNum++;
		this.EmpNum = dernierNum;

		// TODO Auto-generated constructor stub
	}

	/**
	 * * Le 2ieme construcetur par parametres dans lequel on fait appel aux
	 * setteurs pour initialiser quelques attributs de la classe Employe.
	 * 
	 * @param num
	 * @param sex
	 * @param nom
	 * @param prenom
	 * @param age
	 * @param nationalite
	 * @param adresse
	 * @param MotDePasse
	 * @param salaire
	 * @param dateEmbauche
	 */
	public Employe(int num, String sex, String nom, String prenom, int age,
			String nationalite, String adresse, int MotDePasse, double salaire,
			String dateEmbauche) {
		super(sex, nom, prenom, age, nationalite, adresse);

		this.sex = sex;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.nationalite = nationalite;
		this.adresse = adresse;
		motDePasse = MotDePasse;
		// motPasse[dernierNum]=motDePasse;
		this.salaire = salaire;
		this.dateEmbauche = dateEmbauche;
		employes = new ArrayList<>();
		dernierNum++;
		this.EmpNum = num;

		// TODO Auto-generated constructor stub
	}

	public static boolean verifierPassword(int empNum, int pass) {
		boolean reponse = false;
		for (int i = 0; i < employes.size(); i++) {
			Employe emp = employes.get(i);

			if ((emp.getEmpNum() == empNum) && emp.getMotDePasse() == pass)
				reponse = true;
		}
		return reponse;
	}

	/**
	 * @return the empNum d'un employe
	 * 
	 */
	public static int getDerniernum() {
		return dernierNum;
	}

	/**
	 * 
	 * @return le EmpNum de l'employe
	 */
	public int getEmpNum() {
		return EmpNum;
	}

	/**
	 * 
	 * @param nombre
	 *            modifie le dernierNum de l'Employe
	 */
	public static void setDerniernum(int nombre) {
		dernierNum = nombre;
	}

	/**
	 * 
	 * @param empNum
	 * modifie le EmpNum de l'Employe

	 */
	public void setEmpNum(int empNum) {
		EmpNum = empNum;
	}

	/**
	 * @return the motDePasse de l'Employe
	 */
	public int getMotDePasse() {
		return motDePasse;
	}

	/**
	 * @param motDePasse
	 *            modifie le motDePasse
	 */
	public void setMotDePasse(int MotDePasse) {
		motDePasse = MotDePasse;
	}

	/**
	 * @return the salaire de l'Employe
	 */
	public double getSalaire() {
		return salaire;
	}

	/**
	 * @param salaire
	 *            modifie le salaire de l'Employe
	 */
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

	/**
	 * @return the dateEmbauche d'un Employe
	 */
	public String getDateEmbauche() {
		return dateEmbauche;
	}

	/**
	 * @param dateEmbauche
	 *            modifie la dateEmbauche 
	 */
	public void setDateEmbauche(String dateEmbauche) {
		this.dateEmbauche = dateEmbauche;
	}

	public static void addEmployer(Employe E) {
		employes.add(E);

	}

	public static void modifierEmployer(int num, String nom) {
		Employe ade = employes.get(num);
		ade.setNom(nom);

	}

	public static void supprimerEmployer(int adhnum) {

		employes.set(adhnum, null);
		employes.remove(adhnum);
	}

	public static void afficherEmployer() {
		for (Employe emp : employes)
			System.out.println(emp);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employe EmpNum=" + EmpNum + ", motDePasse=" + motDePasse
				+ ", salaire=" + salaire + ", dateEmbauche=" + dateEmbauche
				+ ", sex=" + sex + ", nom=" + nom + ", prenom=" + prenom
				+ ", age=" + age + ", nationalite=" + nationalite
				+ ", adresse=" + adresse + "";
	}

}
