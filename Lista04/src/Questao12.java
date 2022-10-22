import java.util.Scanner;
public class Questao12 {
   /*Autora : Fernanda Jamily Aquino Silva */
	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	double [] vetorA = new double [10];
	double [] vetorB = new double [ vetorA.length];
	int posicao = 0;
	for (int i = 0; i < vetorA.length; i ++) {
	System.out.println("Digite 10 números:");
	vetorA[i] = leia.nextInt();
	}
	while (posicao < vetorA.length) {
	vetorB[posicao] = Math.pow(vetorA[posicao], 3);
	posicao++;
	}
	for (int i = 0; i < vetorA.length; i ++ ) {
	System.out.print("[ " + vetorA [i] + " ]");
	}
	System.out.println("");
	for (int i = 0; i < vetorB.length; i ++ ) {
	System.out.print("[ " + vetorB [i] + " ]");
	}
    leia.close();
	}
}

