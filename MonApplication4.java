public class MonApplication4{
	public static void main(String[] args) {
		System.out.println("Bienvenue dans mon application de gestion ressources humaines");
		String employe1 = "Victor Charles Alfred Wade";
		ServicePaye servicePaye;
		servicePaye = new ServicePaye();
		int salaire1 = servicePaye.calculerSalaire(employe1);
		System.out.println(employe1+ " a un salaire de " +salaire1);
	}
}