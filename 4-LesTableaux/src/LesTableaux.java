import java.util.Scanner;
public class LesTableaux {

	
	// On donne un valeur en rapport � plusieurs variable. 
	// Un tableaux en java commence par 0 
	// On l'utilise pour sotcker une m�me variable. 
	// Exemple un score plusieurs joueurs.  
	// Plusieurs types de tableaux existent en java. 
	
	// 1-De quel taille sera mon tableau ? 
	// a) La taille va varier ou non ? 
	// b) Si il varie pas 
	// Cf.Le tableau du cours pour bien comprendre. 
	
	// On utilise 3 types de tableaux. 
	// On fait usage des arrayList que �a varie ou non mais si on connait la taille
	// ArrayList pour les tableaux dynamiqu et les tailles de tableaux qui varient. (Ex : Liste �tudiants)
	
	public static void main(String[] args) {
		Scanner Saisie = new Scanner(System.in); 
		//D�claration d'un tableau integer : 
		//Le tableaux est initialis�es. 
		int [] Score={1000,2000,3000,4000}; 
		//On peut �galement faire un tableau en utilisant des expression
		int [] Scores={(2000/2),(1000*3),300,4000,5000};
		
		int [] score3;  
		score3 = new int [5]; 
		//La ligne au dessus �quivaut � celle-ci en dessous
		int [] score4 =new int[4];
		score4[0]=100; 
		score4[1]=200; 
		score4[2]=300;  
		score4[3]=400; 
		for (int i=0; i<=3;i++)
		{
			System.out.println(score4[i]);
		}
		// Comment remplir mon tableau: 	
		int [] score5 = new int [5];  
		score5[0]=1000;
		score5[1]=2000;		
		score5[2]=3000;
		score5[3]=4000; 
		score5[4]=5000;  
	
		//Affichgage des �l�ment tableaux 
		
		// /De cette mani�re on peut voir le tableau saisie.
		for( int i=0;i<=4;i++)   
		{
		System.out.println(score5[i]); 	
		}
		{
		System.out.println(score5.length);
		//Cette ligne permet de connaitre la taille de son tableau
		}	 
		for (int i=0;i<=2;i++) 
		{
			
		System.out.println(score3.length);
		}
		
		int [] tableau1= {(1000*2),2000,(3000)/4} ; // Sur une ligne *
		tableau1 = new int[4];  			// Sur 2 ligne 
	
		for(int j=0;j<100000;j--) {
			
		}
	
		
}
}
	