import java.util.Scanner;
public class ValeurDouble {

	public static void main(String[] args) {
		
		/*Scanner Valeur = new Scanner(System.in);  
		
		System.out.println("Saisie une premier valeur ");
		double  Valeur1 = Valeur.nextDouble();
		System.out.println("Saisie une seconde valeur ");
		double Valeur2 = Valeur.nextDouble();
		System.out.println("Saisie une troisième valeur ");
		double Valeur3 = Valeur.nextDouble();
		System.out.println("Saisie une quatrième valeur ");
		double Valeur4 = Valeur.nextDouble();
		System.out.println("Saisie une cinquième valeur");
		double Valeur5 = Valeur.nextDouble();
		System.out.println("Vous avez saisie les donnèes suivantes\n"+Valeur1+"\n"+Valeur2+"\n"+Valeur3+"\n"+Valeur4+"\n"+Valeur5+"\n");
		*/
		
		Scanner Saisie = new Scanner(System.in);
		System.out.println("Veuilllez entrer 5 valeurs (double) svp");
		Double[] tableauDouble = new Double[6];
		for (int i = 0; i<6; i++) { //Boucle qui permet de faire la saisie. 

			tableauDouble[i] = Saisie.nextDouble(); 
		}	
		 
			 for (int i = 0; i < 6; i++) {
			 System.out.println("Vous avez affichier les valeurs double ");
			 System.out.println(tableauDouble[i]);
             
			 
			 
		 }
		 
	} 
		
	}
