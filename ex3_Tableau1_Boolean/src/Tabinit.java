import java.util.Scanner;

public class Tabinit {

	public static void main(String[] args) {
	
	
		//Import Scanner 
		Scanner Saisie = new Scanner(System.in);
		//Initialisation des variable
		int[] tab= {12,15,13,10,8,9,13,14}; 
		boolean existe=false; 
		System.out.println("Veuilllez entrer une valeur?");
		//Action utilisateur
		int n= Saisie.nextInt();
		//Récupération de la donnée saisie par l'utilisateur. 
		for (int i=0; i<tab.length;i++)
		//test de la valeur saisie dans tab	
			if(tab[i]==n) 
		//Si la valeur saisie par l'utlisateur est bien dans tab alors j'affiche "oui"
			{
				existe = true; 			
			}
		if(existe) {
			
			System.out.println("La valeur est bien dans votre tableau");
			//J'affiche oui le nomnbre est bien dans le tableau 
		}
		else
		{
			System.out.println("Non la valeur n'est pas dans le tableau");
			//J'affiche que le chiffre n'est pas de la tableau
			
		}
			

	}
}
