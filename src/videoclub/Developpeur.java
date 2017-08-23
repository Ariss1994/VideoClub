package videoclub;

public class Developpeur extends Personne {
	 @SuppressWarnings("unused")
	private String [] listeJeuDevelopper;

	/**
	 * Le construcetur par parametres dans lequel on fait appel aux setteurs
	 * pour initialiser quelques attributs de la classe Developpeur.
	 * @param sex
	 * @param nom
	 * @param prenom
	 * @param age
	 * @param nationalite
	 * @param adresse
	 */
	public Developpeur(String sex, String nom, String prenom, int age,
			String nationalite, String adresse) {
		super(sex, nom, prenom, age, nationalite, adresse);
		// TODO Auto-generated constructor stub
	}
	 
}

