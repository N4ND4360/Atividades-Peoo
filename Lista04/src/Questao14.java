import java.util.Scanner;
public class Questao14 {
	/*Autora : Fernanda Jamily Aquino Silva */
	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	int[] vetorA = new int[10];
	int[] vetorB = new int[10];
	int[] vetorC = new int[10];
	for (int i = 0; i < 10; i++) {
    System.out.println("Digite o "+(i+1)+ "° elemento do vetor 1:");
    vetorA[i] = leia.nextInt();
	}
	System.out.println();
	for(int i = 0; i < 10;i++) {
	System.out.println("Digite o "+(i+1)+ "° elemento do vetor 2:");
	vetorB[i] = leia.nextInt();
	}
	for(int i = 0; i < 10;i++) {
	vetorC[i]= vetorA[i] * vetorB[i];
	System.out.println((i+1)+ "° elemento do vetor resultante: " + vetorC[i]);

	}
	}

}
