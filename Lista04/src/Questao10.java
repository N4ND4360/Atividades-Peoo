import java.util.Scanner;
public class Questao10 {
	/* Autora: Fernanda Jamily Aquino Silva*/
	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	int vetor [] = new int [10];
    for (int i = 0; i < vetor.length; i++) {
	System.out.println("Digite os 10 valores do vetor: ");
	vetor [i] = leia.nextInt();
    }
    int vMaior = vetor[0];
    int pos = 0;
    for (int i = 0; i < vetor.length; i++) {
    if(vetor[i] > vMaior) { 
    vMaior = vetor[i];
    pos++;
	}
    }
    int tmp = vetor[vetor.length - 1];
    vetor[vetor.length - 1] = vMaior;
    vetor[pos] = tmp;
    System.out.println("Resultado ap�s a troca: ");
    for (int i = 0; i < vetor.length; i++) {
	System.out.println("[ "+ vetor[i] + " ]");
    }
    System.out.println();
    System.out.println("A posi��o do indice: " + pos);	
	System.out.println("Ultimo elemento �: " + tmp);
	
	}

}
