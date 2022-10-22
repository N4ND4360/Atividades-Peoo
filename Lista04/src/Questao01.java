import java.util.Scanner;
public class Questao01 {
	/* Autora: Fernanda Jamily Aquino Silva*/
	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	int [] vetor = new int [10];
	for (int i = 0; i < vetor.length; i++) {
	System.out.println("Digite 10 números: ");
	vetor[i] = leia.nextInt();
	}
    for (int posicao = 0; posicao < vetor.length; posicao++ ) {
    System.out.print("[ "+ vetor[posicao] + " ]");	
    }
    leia.close();
	}
	}
