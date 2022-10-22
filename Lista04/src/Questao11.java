import java.util.Scanner;
public class Questao11 {
	/* Autora: Fernanda Jamily Aquino Silva*/
	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	int [] vetor = new int[20];
	int posicao = vetor.length - 1;
	for(int i = 0; i < vetor.length; i++) {
    System.out.println("Digite 20 valores: ");
    vetor[i] = leia.nextInt();
	}
	for (int i = 0; i < vetor.length; i++) {
	System.out.print("[ " + vetor[i] + " ]");
	}
	System.out.println("");
	for (int i = 0; i < vetor.length/2; i++) {
	int tmp = vetor[i];
	vetor[i] = vetor[posicao];
	vetor[posicao] = tmp;
	posicao--;
	}
	for (int i = 0; i < vetor.length; i++) {
	System.out.print("[ " + vetor[i] + " ]");
	}
	}

}
