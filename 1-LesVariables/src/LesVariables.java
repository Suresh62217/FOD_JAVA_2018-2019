import java.util.Scanner;
public class LesVariables {

	public static void main(String[] args) {
		
		
		
									// Cours1-Les Variables (Cours important pour la programmation basique.  
		
		/*Les types de variables sont 
		 * 
		 * int 	  (Entier).
		 * Double (chiffre à 2 virgules).
		 * Float  (Chiffre à virgules flottantes).
		 * short  (maximum chiffre à 255 bits). 
		 * String (Pour une chaine de caractère autrement dit : "Une phrase entière par exemple : prénom, nom etc..). 
		 */
		System.out.println("Veuillez entrer votre age?, svp"+"");
		
		//Cette classe est importante car elle récupère la saise User.  
		Scanner sc =new Scanner(System.in); 

		//Cette ligne Récupére entièrement la réponse de l'utilisateur. 
		int age1 = sc.nextInt(); // 
		//Int est un type de varialbe (entier = entier).  
		
		//=> Le Sysout ici permet une demande d'information à l'utlisateur du programme. 

		System.out.println("votre age est de "+age1+"\n"+"ans\n");
		//=> Le Sysout ici affiche la réponse de l'age. 	
			
	}

}
