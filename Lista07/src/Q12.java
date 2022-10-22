import java.util.Scanner;
public class Q12 {

	public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);
		
		System.out.println("Escreva uma frase para separar pelas iniciais: ");
		String frase = leia.nextLine();
		
		String[] vetor = frase.split(" ");
		char[] iniciais = new char[vetor.length];
		
		for(int i = 0; i < vetor.length; i ++) {
			iniciais[i] = vetor[i].charAt(0);
		}
		for(int i = 0; i < vetor.length; i ++) {
			System.out.print(iniciais[i]);
		}

	}

}
