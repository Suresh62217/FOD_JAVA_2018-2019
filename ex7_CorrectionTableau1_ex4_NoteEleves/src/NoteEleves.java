import java.util.Scanner;
public class NoteEleves {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		//Déclarations et initialisation des variables 
		double somme=0; double plgrNote=0; double plnote=0; double moyenne=0;  
		//Définition de la variable pour le nombre d'eleves.  
		System.out.println("Donnez la taille du tableau");
        //Définition de la variable (Nombre) 
		int nombre= sc.nextInt(); 
        //Creation du tableau
		double [] tabNote=new double [nombre];  
		//Sasie des notes dans le tableau.  
		System.out.println("Saisissez les notes des élèves:");
		for(int i=0;i<nombre;i++){
		//Chaque fois qu'une personne rentre une note il va dans le tableau 	
		System.out.println("La note:"+(i+1)+"est égtale à");
		//
		tabNote[i]=sc.nextDouble(); 
		somme= somme+tabNote[i];  
		moyenne=somme/nombre;  
		plgrNote=Math.max(plgrNote,tabNote [i]); 
		plnote=Math.min(plnote, tabNote[i]);
		}
		
		plnote=tabNote[0];  
		for(int i =0; i<nombre;i++) {
			plnote=Math.min(plnote,tabNote[i]); 
	    System.out.println("Moyenne des notes"+moyenne);
		System.out.println("Somme des notes "+somme);
		System.out.println("plus grandes notes"+plgrNote);
		System.out.println("La plus petite des notes"+plnote);
		
		
		}
		
		
			
			
		}
 		}

	

	
