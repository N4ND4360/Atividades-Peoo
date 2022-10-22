import java.util.Scanner; 
public class Questao03 {
    /* Autora: Fernanda Jamily Aquino Silva*/
	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);	
	int [] vetor = new int [20];
	for (int i = 0; i < vetor.length; i++) {
	System.out.println("Digite 20 números: ");
	vetor[i] = leia.nextInt();
	}
	for (int posicao = 0; posicao < vetor.length; posicao++) {
    if (vetor [posicao] % 2 == 0) {
	System.out.print("[ "+ vetor[posicao] + " ]");
	}
	}
	leia.close();
	}
    }
