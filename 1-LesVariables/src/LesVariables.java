import java.util.Scanner;
public class LesVariables {

	public static void main(String[] args) {
		
		
		
									// Cours1-Les Variables (Cours important pour la programmation basique.  
		
		/*Les types de variables sont 
		 * 
		 * int 	  (Entier).
		 * Double (chiffre � 2 virgules).
		 * Float  (Chiffre � virgules flottantes).
		 * short  (maximum chiffre � 255 bits). 
		 * String (Pour une chaine de caract�re autrement dit : "Une phrase enti�re par exemple : pr�nom, nom etc..). 
		 */
		System.out.println("Veuillez entrer votre age?, svp"+"");
		
		//Cette classe est importante car elle r�cup�re la saise User.  
		Scanner sc =new Scanner(System.in); 

		//Cette ligne R�cup�re enti�rement la r�ponse de l'utilisateur. 
		int age1 = sc.nextInt(); // 
		//Int est un type de varialbe (entier = entier).  
		
		//=> Le Sysout ici permet une demande d'information � l'utlisateur du programme. 

		System.out.println("votre age est de "+age1+"\n"+"ans\n");
		//=> Le Sysout ici affiche la r�ponse de l'age. 	
			
	}

}
