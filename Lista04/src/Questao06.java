import java.util.Scanner;
public class Questao06 {
	/* Autora: Fernanda Jamily Aquino Silva*/
	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	int vetor[] = new int[5];
	int iMaior = vetor[0];
	
	int indice = 0;
	for(int i = 0; i < vetor.length; i++) {
	System.out.println("Digite 10 n�meros: ");
	vetor[i] = leia.nextInt();
	}
	for(int i = 0; i < vetor.length; i ++) {
	if(vetor[i] > iMaior) {
	iMaior = vetor[i];
	indice = i;
	}
	}
	System.out.println("O maior n�mero �: " + iMaior);
    System.out.println("O indice �: " + indice);
    int iMenor = vetor[0];
	int indice2 = 0;
	for(int i = 0; i < vetor.length; i++ ) {
	if (iMenor > vetor[i]) {
	iMenor = vetor[i];
	indice2 = i;
	}
	}
	System.out.println("O menor n�mero �: " + iMenor);
	System.out.println("O indice �: " + indice2);
	}
	

}
