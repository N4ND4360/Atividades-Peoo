import java.util.Scanner;
public class Questao07 {
	/* Autora: Fernanda Jamily Aquino Silva*/
	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	System.out.println("Digite um n�mero: ");
	int numero = leia.nextInt();
	int x = 0;
	while(x * x <= numero) {
	x++;
	}
	System.out.println("O menor inteiro positivo cujo o quadrado � superior a "+numero+" � : "+ x);

	}

}
