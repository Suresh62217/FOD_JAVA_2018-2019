import java.util.Scanner;
public class StructureDeControle {

	public static void main(String[] args) {

		/*
		 		Cour2-Les Structures de controle existantes
		 
		 *If (Si) 
		 *Else (Tant que)  
		 *do while (Boucle) 
		 *Switch Case 
		
		*Opérateurs arithmétiques. 
		 	+ 
		 	- 
		 	*
		 	/
		 	 
		 */
		
		//Ligne permettante de récupérer une saisie de l'utilisateur. 
		Scanner sc =new Scanner(System.in); 
		//Affiche une demande de saisie pour l'utilisateur
		System.out.println("Veuillez entrer votre age pour jouer");
		//Affiche le "typedef" de variable à récupérer ici un entier. 
		int age1 = sc.nextInt(); 
		//Affiche la réponse dans un texte à l'utilisateur
		System.out.println("votre age est de "+""+age1+"ans");
		
	
	//Condition if mise en place pour un accès au programme, on fait une demande de majorité pour accèder au site. 
	if (age1 >= 18)
	{
		System.out.println("Parfait vous pouvez entrer sur le site Web du jeu");
	// Affiche du texte et fait des demande  aux users.  
	}
	//On fait un refus d'accès au site grace à ce else (tant que il n'y pas la majorité).  
	else 
	{
		System.out.println("Vous n'avez pas l'age parfait pour entrer dans cette zone du web");
	}
	
	// Au dessus de 3 if il faut usage de switch case.
	
	
}
}
