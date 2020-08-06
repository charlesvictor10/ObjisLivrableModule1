public class MonApplication5{
	public static void main(String[] args) {
		System.out.println("Bienvenue dans mon application de gestion ressources humaines");
		Employe employe = new Employe();
		System.out.println("Employe: "+employe.getNom()+" "+employe.getPrenom());
		employe.setNom("WADE");
		employe.setPrenom("Victor Charles Alfred");
		System.out.println("Employe: "+employe.getNom()+" "+employe.getPrenom());
	}
}