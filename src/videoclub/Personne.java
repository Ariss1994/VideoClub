package videoclub;

/**
 * 
 * @author Ahmad El-Ariss 1008651
 * @author Jean Emmanuel Charles 1065027
 * @author CHAHID NEZHA p1060244
 * @version 1.0
 * @since 31 Mars 2014
 * 
 */
public class Personne {
	String sex;
	String nom;
	String prenom;
	int age;
	String nationalite;
	String adresse;

	/**
	 * Le construcetur par parametres dans lequel on fait appel aux setteurs
	 * pour initialiser quelques attributs de la classe Personne.
	 * 
	 * @param sex
	 * @param nom
	 * @param prenom
	 * @param age
	 * @param nationalite
	 * @param adresse
	 */

	public Personne(String sex, String nom, String prenom, int age,
			String nationalite, String adresse) {
		super();
		this.sex = sex;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.nationalite = nationalite;
		this.adresse = adresse;
	}

	/**
	 * @return the sex de la Personne
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * @param sex
	 *            the sex to set modifie le sex d'une personne
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}

	/**
	 * @return the nom d'une personne
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom
	 *            modifie le nom d'une personne
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the prenom 
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom
	 *            modifie le prenom
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * @return the age d'une personne
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age
	 *            modifie age 
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the nationalite d'une personne
	 */
	public String getNationalite() {
		return nationalite;
	}

	/**
	 * @param nationalite
	 *            modifie nationalite 
	 */
	public void setNationalite(String nationalite) {
		this.nationalite = nationalite;
	}

	/**
	 * @return the adresse d'une personne
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * @param adresse
	 *            modifie adresse 
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
}
