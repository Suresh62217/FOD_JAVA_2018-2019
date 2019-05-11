import java.util.Scanner;

public class CorrectionEx2Tableau {

	public static void main(String[] args) {
		
		
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