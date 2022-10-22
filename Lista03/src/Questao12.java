import java.util.Scanner;
public class Questao12 {
	/* Autora: Fernanda Jamily Aquino Silva*/
	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);	
    int n1, n2;
    int soma = 0;
    int i = 0;
    System.out.println("Digite o primero número: ");
    n1 = leia.nextInt();
    System.out.println("Digite o segundo número: ");
    n2 = leia.nextInt();
    while(i < n1) {
    soma = soma + n2;
    i++;
    }
    System.out.println("Resultado é: " + soma);
	}

}
