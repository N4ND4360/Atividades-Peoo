import java.util.Scanner;
public class Questao05 {
	/* Autora: Fernanda Jamily Aquino Silva*/
	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	int vetor[] = new int[10];
	int iMaior = vetor[0];
	int indice = 0;
	for(int i = 0; i < vetor.length; i++) {
	System.out.println("Digite 10 números: ");
	vetor[i] = leia.nextInt();
	if(vetor[i] > iMaior) {
	iMaior = vetor[i];
	indice = i;
	}
	}
    System.out.println("O maior número é: " + iMaior);
    System.out.println("O indice é: " + indice);
	}

}
