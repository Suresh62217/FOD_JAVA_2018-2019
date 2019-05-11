import java.util.ArrayList;

public class Annales2018 {

	public static void main(String[] args) {
		int v=13; 
		boolean premier=true; 
		for(int k=2;k<v;k=k+1)
		     if (v%k == 0) premier = false;
		 if (premier) System.out.println("PREMIER");
		else System.out.println("NON PREMIER");


}
}