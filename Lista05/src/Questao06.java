import java.util.Scanner;
public class Questao06 {

	public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);
		
		int[][] matriz1 = new int[5][5], matriz2 = new int[5][5], sMatriz = new int[5][5];
		
		System.out.println("RESPONDA COM NÚMEROS NATURAIS!!!");
		System.out.printf("\nValores da MATRIZ 1:\n\n");
		
		for(int i = 0; i < matriz1.length; i++) {
			for(int j = 0; j < matriz1[i].length; j++) {
				System.out.println("Digite o elemento da:");
				System.out.printf("Coluna %d da linha %d --> ", (i + 1), (j + 1));
				matriz1[i][j] = leia.nextInt();
				
			}
		}
		System.out.printf("\nValores da MATRIZ 2:\n\n");
		
		for(int i = 0; i < matriz2.length; i++) {
			for(int j = 0; j < matriz2[i].length; j++) {
				System.out.println("Digite o elemento da:");
				System.out.printf("Coluna %d da linha %d --> ", (i + 1), (j + 1));
				matriz2[i][j] = leia.nextInt();
				
			}
		}
		System.out.printf("\nComo ficou a matriz 1:\n\n");
		
		for(int i = 0; i < matriz1.length; i++) {
			for(int j = 0; j < matriz1[i].length; j++) {
				System.out.print(matriz1[i][j] + " ");
			}
		System.out.println();
		}
		System.out.printf("\nComo ficou a matriz 2:\n\n");
		
		for(int i = 0; i < matriz2.length; i++) {
			for(int j = 0; j < matriz2[i].length; j++) {
				System.out.print(matriz2[i][j] + " ");
			}
		System.out.println();
		}
		System.out.printf("\nSoma das matrizes:\n\n");
		
		for(int i = 0; i < sMatriz.length; i++) {
			for(int j = 0; j < sMatriz[i].length; j++) {
				sMatriz[i][j] = matriz1[i][j] + matriz2[i][j];
				
				System.out.print(sMatriz[i][j] + " ");
			}
		System.out.println();
		}

	}

}
