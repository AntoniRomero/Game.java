import java.util.Random;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random r = new Random();
		int intentos = 0;
		int preciojusto = r.nextInt(200);
		int precio = 0;
		
		while(preciojusto != precio) {
			System.out.println(" A�ade un numero entre 1 y 200");
			Scanner Scan = new Scanner(System.in);
			
			
			
			if(preciojusto>precio){
				System.out.println(" es m�s ");
			}else{
				System.out.print(" es menos ");
			};
			precio = Scan.nextInt();
			intentos++;
			
		}
		System.out.print("Bravo:El precio justo es "+ preciojusto);
		System.out.print("En"+ intentos +"intentos");
		
		
	}

}
