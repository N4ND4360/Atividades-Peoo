import java.util.Scanner;
public class Questao08 {
    /*Autora: Fernanda Jamily Aquino Silva*/
	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	System.out.println("Digite a sua quantidade de jogadas:  ");
    int quantidade = leia.nextInt();
    int[] vetor = new int [quantidade];
    for (int i = 0; i < vetor.length; i++) {
    System.out.println("Digite os número que saiu em cada jogada: ");
    vetor[i] = leia.nextInt();
    }
    int[] lados =  new int [7];
    for (int posicao = 0; posicao < vetor.length; posicao++ ) {
    lados[vetor[posicao]]++;	
    }
    for ( int i = 1; i < lados.length; i++) {
    System.out.print("[ " + lados[i] + " ]");	
    }
    leia.close();
	}

}
