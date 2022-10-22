import java.util.Scanner;

public class Questao08 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int [] [] matriz = new int [6] [6];
		int [] dig = new int[6];
		int [] pares = new int[6];
		for(int i =0; i < matriz.length; i++){
			for(int j = 0; j < matriz.length; j++){
				System.out.println("Preencha a matriz: ");
				matriz[i][j] = leia.nextInt();
			}
		  }
		
		 for(int i =0; i < matriz.length; i++){
			  for(int j = 0; j < matriz.length; j++){
				  System.out.print( matriz[i][j] + " ");
			  }
		 System.out.println();
		 }
		 
		 System.out.println("Diagonal: ");
		 for(int i =0; i < matriz.length; i++){
			 for(int j = 0; j < matriz.length; j++){
				 if(i == j){
			    dig[i] = matriz[i][j];
			    System.out.print(dig[i] + " ");
			    
				 }
			 }
		}
		 System.out.println();
		 System.out.println("Linhas pares: ");
		 for(int i =0; i < matriz.length; i++){
			 for(int j = 0; j < matriz.length; j++){
			 if(i == 0) {
			 }
			 else if(i % 2 == 0){
			 pares[i] = matriz[i][j];
			 System.out.print(pares[i] + " ");
			 }
			 }
		}

	}

}
