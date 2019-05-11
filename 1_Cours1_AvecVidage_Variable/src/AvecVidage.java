import java.util.Scanner;
public class AvecVidage {

	
		// Avec vidage les choses sont plus claire que sans le vidage.  
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in); // ok 
	      System.out.println("Saisissez un entier : "); // ok  
	      int i = sc.nextInt(); // ok 
	      System.out.println("Saisissez une chaîne : "); // ok
	      sc.nextLine(); // cette ligne vide le code précédent. 
	      String str = sc.nextLine(); 
	      System.out.println("FIN ! ");

	      /* 
	       Sans vidage. 
	       
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Saisissez un entier : ");
	      int i = sc.nextInt();
	      System.out.println("Saisissez une chaîne : ");
	      String str = sc.nextLine();
	      System.out.println("FIN ! ");
	}
	        
	      */
	}

}
