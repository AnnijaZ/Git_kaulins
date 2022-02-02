import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class Kaulins {
	static int mestKaulinu(int reizes){
		Random rand = new Random();
		int skaitlis, lielakais=0;
		int skaitlis=0, lielakais=0;
		for(int i=1; i<=reizes; i++){
			skaitlis=rand.nextInt(6)+1;
			System.out.println("Uzkrita: "+skaitlis);
			if(lielakais<skaitlis){
				lielakais=skaitlis;
			}
		}
		System.out.println("Liel�kais skaitlis metienu reiz� ir: "+lielakais);
				}
			
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		List<Integer> pedejie = new ArrayList<Integer>();
		int reizes, izvele;
		do{
			System.out.println("1-Mest kaulinu | 2-Apskatit pedejos | 3-Apturet");
			izvele = scan.nextInt();
			switch(izvele){
			case 1:
		do{
		System.out.println("Cik reizes mest kaulinu?");
		reizes = scan.nextInt();
		}while(reizes<=1);
		pedejie=mestKaulinu(reizes);
		break;
			case 2:
				System.out.println("Pedeja metiena skaitli ir ");
				for(int i=0; i<pedejie.size(); i++){
					pedejie.get(i);
				} 	
				break;
				
			case 3:
				int lielakais = 0;
				for(int i=0; i<pedejie.size(); i++){
					if(pedejie.get(i)>lielakais){
						lielakais = pedejie.get(i);
					}
				}
				System.out.println("Lielakais skaitlis pedeja metiana ir"+lielakais);
				break;
				
			case 4:
				System.out.println("Programma aptureta!");
				break;
	}
		}while(izvele!=2);
		scan.close();

}
}

