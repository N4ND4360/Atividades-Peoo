import java.util.Scanner;
public class Questao03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int [] [] numeros = new int [3] [3];
		
		for(int i =0; i < numeros.length; i++){
			for(int j = 0; j < numeros.length; j++){
				System.out.println("Preencha a matriz: ");
				numeros[i][j] = leia.nextInt();
			}
		  }
		
		 for(int i =0; i < numeros.length; i++){
			  for(int j = 0; j < numeros.length; j++){
				  System.out.print( numeros[i][j] + " ");
			  }
		 System.out.println();
		 }
		 
		 System.out.println("Diagonal: ");
		 for(int i =0; i < numeros.length; i++){
			 for(int j = 0; j < numeros.length; j++){
				 if(i == j){
					 System.out.print(numeros[i][j] + " ");
				 }
			 }
		}

	}

}
