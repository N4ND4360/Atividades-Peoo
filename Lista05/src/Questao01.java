import java.util.Scanner;
public class Questao01 {

	public static void main(String[] args) {
      Scanner leia = new Scanner(System.in);
		
		System.out.println("Quantas linhas vai ter a tabela?");
		int l = leia.nextInt();
		
		System.out.println("Quantas colunas vai ter a tabela?");
		int c = leia.nextInt();
		
		String[][] matriz = new String[l][c];
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				System.out.println("Digite o seguinte elemento:");
				System.out.printf("Coluna %d da linha %d:\n", (j + 1), (i + 1));
				matriz[i][j] = leia.next();
				
			}
		}
		System.out.printf("Como ficou a sua tabela:\n");
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
			

	}

}
