import java.util.Scanner;

public class CorrectionEx3Tableau {

	public static void main(String[] args) {

		
		Scanner Saisie = new Scanner(System.in);
		System.out.println("Veuilllez entrer une valeur?");
		int[] tab= {12,15,13,10,8,9,13,14}; 
		boolean existe=false; 
		int n= Saisie.nextInt(); 
		for (int i=0; i<tab.length;i++)
			if(tab[i]==n) {
				existe = true; 
				
			}
	
		if(existe) {
			
			System.out.println("La valeur est bien dans votre tableau");
		}
		else
		{
			System.out.println("Non la valeur n'est pas dans le tableau");
		}	

	}

}

