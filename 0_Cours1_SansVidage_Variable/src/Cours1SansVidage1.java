import java.util.Scanner;
public class Cours1SansVidage1 {

	public static void main(String[] args) {

			//  Ce programme montre comment faire usage de variable "sans vidage de ligne de codes" 
			
		
		Scanner sc = new Scanner(System.in);
	      System.out.println("Saisissez un entier : ");
	      int i = sc.nextInt();
	      System.out.println("Saisissez une chaîne : ");
	      String str = sc.nextLine();
	      System.out.println("FIN ! ");
	}

}
