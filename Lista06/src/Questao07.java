import java.util.Scanner;

public class Questao07 {

	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	char [] vetor = new char[5];
	for(int i = 0; i < vetor.length; i++) {
	System.out.println("Preencha o vetor: ");
	vetor[i] = leia.next().charAt(0);
	}
    char[] resultado = retorno(vetor);
    String str = String.valueOf(vetor);
    System.out.print("Os dados do vetor char: " + "[ "+ str + " ]");
    }
	
	static char[] retorno(char [] vetor) {
	
	return vetor;
		}

}
