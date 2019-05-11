import java.util.Scanner;
public class LesBoucles {

	public static void main(String[] args) {

		// Classe Scanner pour récupérer la saisie @user
		Scanner Saisie = new Scanner (System.in);  
		
		//Saisie @user
		
		//Ici j'instancie la variable. 
		int age = Saisie.nextInt();  
		for (int age1 =0; age1<3;age++)
		//Condition en plus de la boucle
		{
			System.out.println("veuilleze entrer votre age, merci"); 
		}
		for (int age1=0; age1<3;age1++) {
			
			System.out.println("Vous avez donc "+age1+""+"ans\n"); 
			
			
		}

	}

}
