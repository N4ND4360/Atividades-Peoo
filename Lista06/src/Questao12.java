import java.util.Scanner;
public class Questao12 {

	public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);
		
		int[][] matriz = new int[3][3];
		
		int eMaior = 0;
		int l = 0, c = 0;
		
		System.out.println("Preencha a matriz:");
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				System.out.print("Digite um número natural--> ");
				matriz[i][j] = leia.nextInt();
			}
		}
			System.out.println(nMaior(matriz, eMaior) + " é o maior número da matriz");
			System.out.println();
			for(int i = 0; i < matriz.length; i++) {
				for(int j = 0; j < matriz[i].length; j++) {
					System.out.print(matriz[i][j] + " ");
				}
				System.out.println();
			}
	}
	static int nMaior(int[][] matriz, int eMaior) {
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] >= eMaior) {
					eMaior = matriz[i][j];
				}
			}
		}
		return eMaior;
	}

}

	


