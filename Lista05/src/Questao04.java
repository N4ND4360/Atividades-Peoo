import java.util.Scanner;
public class Questao04 {

	public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);
		
		double[][] matriz = {{2.55, 2.14, 4.75}, {3.14, 1.25, 0.73}, {0.33, 1.62, 3.61 }};
		
		System.out.println("Foi gerado uma matriz de 3 x 3 com n�meros reais entre 0 e 5");
		System.out.println("Qual n�mero voc� quer saber se est� l�?");
		double n = leia.nextDouble();
		int nEncontrado = 0;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (n == matriz[i][j]) {
					System.out.println("O n�mero foi encontrado!!!");
					System.out.printf("Ele estava na coluna %d da linha %d\n", j, i);
					nEncontrado++;
				}
			}
		}
		if (nEncontrado == 0) {
			System.out.println("O N�MERO N�O FOI ENCONTRADO!!!");
		}
		System.out.println("A matriz:");
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
				
			}
			System.out.println();
		}

	}

}
