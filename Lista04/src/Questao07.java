import java.util.Scanner;
public class Questao07 {
	/* Autora: Fernanda Jamily Aquino Silva*/
	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	int[] vetor = new int[10] ;
    int proVetor = 0;
    for (int i = 0; i < vetor.length; i++) {
    System.out.println("Digite os valores das posições: ");	
    vetor[i] = leia.nextInt();
    }
    System.out.println("Digite um valor que deseja procurar no vetor: ");
    proVetor = leia.nextInt();
    for(int i = 0; i < vetor.length; i++){
    if(vetor[i] == proVetor){
    System.out.println("O número digitado exite e está na posição: " + i);
    }else if(i == vetor.length-1){
    System.out.println("Número não encontrado no vetor!");
	}
	}
    }
    }
    