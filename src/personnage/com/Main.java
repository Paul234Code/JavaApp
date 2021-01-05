package personnage.com;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personnage paul = new Personnage("Paul Faye","Mbia",45,"Etudiant");
		Personnage jean = new Personnage("Jean","Diatta",45,"Etudiant");
		Personnage pierre = new Personnage("Pierre","Diouf",45,"Etudiant");
		Personnage simon = new Personnage("Simon","Dione",45,"Etudiant");
        System.out.println(paul.toString());
        System.out.println("---------------------------------------------------");
        System.out.println(pierre.toString());
        System.out.println("---------------------------------------------------");
        System.out.println(simon.toString());
        System.out.println("---------------------------------------------------");
        System.out.println(jean.toString());
        //System.out.println("---------------------------------------------------");
        
	}

}
