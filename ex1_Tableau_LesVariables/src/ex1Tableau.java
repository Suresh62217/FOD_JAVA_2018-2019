import java.util.Scanner;

public class ex1Tableau {
	
	public static void main(String[]args) 
	
	{
		Scanner Saisie = new Scanner(System.in);
		System.out.println("Veuilllez entrer 5 valeurs (Chaine de caractère) svp");
		String[] tableauString = new String[6];
		for (int i = 0; i < 6; i++) { //Boucle qui permet de faire la saisie. 

			tableauString[i] = Saisie.nextLine();

		}

		System.out.println("Vous avez saisi les chaînes de caractère suivante.");
		for (int i = 0; i < 6; i++) { // Boucle qui permet d'afficher ou de récupérer la fin du programme.
		System.out.println(tableauString[i]);
		
		//
		}
	}
	
	
	
	}
	


