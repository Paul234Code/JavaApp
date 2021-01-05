package personnage.com;
/**
 * 
 */

/**
 * @author fayel
 *
 */
public class Personnage {
	private String prenom;
	private String nom;
	private Integer age;
	private String profession;
	/**
	 * @param prenom
	 * @param nom
	 * @param age
	 * @param profession
	 */
	public Personnage(String prenom, String nom, Integer age, String profession) {
		this.prenom = prenom;
		this.nom = nom;
		this.age = age;
		this.profession = profession;
	}
	//fonction qui retourne le prenom
	public String getPrenom() {
		return prenom;
	}
	// fonction qui retourne le nom
	public String getNom() {
		return nom;
	}
	// fonction qui retourne l'age du personnage
	public Integer getAge() {
		return age;
	}
	//fonction qui retourne la profession du personnage
	public String getProfession() {
		return profession;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	@Override
	public String toString() {
		return "Personnage [prenom=" + prenom + ", nom=" + nom + ", age=" + age + ", profession=" + profession
				+ ", getPrenom()=" + getPrenom() + ", getNom()=" + getNom() + ", getAge()=" + getAge()
				+ ", getProfession()=" + getProfession() + "]";
	}
	

}
