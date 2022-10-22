import java.util.Scanner;
public class Questao06 {
	/* Autora: Fernanda Jamily Aquino Silva*/
	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	int numero, multi = 1;
	System.out.println("Digite um número: ");
	numero = leia.nextInt();
	System.out.println();
	if(numero>=0) {
	for (int i = 1;  i <= numero; i++) {
	multi = multi *i;
	}
	System.out.println("Resultado da fatorial: " + multi);
	}
  }

}
