import java.util.Random;
import java.util.Scanner;

public class Kaulins {
	static void mestKaulinu(int reizes){
		Random rand = new Random();
		int skaitlis, lielakais=0;
		for(int i=1; i<=reizes; i++){
			skaitlis=rand.nextInt(6)+1;
			System.out.println("Uzkrita: "+skaitlis);
			if(lielakais<skaitlis){
				lielakais=skaitlis;
			}
		}
		System.out.println("Lielâkais skaitlis metienu reizç ir: "+lielakais);
	}
	
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		int reizes;
		
		do{
		System.out.println("Cik reizes mest kaulinu?");
		reizes = scan.nextInt();
		}while(reizes<=0);
		mestKaulinu(reizes);
		scan.close();
	}
	

}
