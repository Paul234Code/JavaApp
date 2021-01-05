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
	public String getPrenom() {
		return prenom;
	}
	public String getNom() {
		return nom;
	}
	public Integer getAge() {
		return age;
	}
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
