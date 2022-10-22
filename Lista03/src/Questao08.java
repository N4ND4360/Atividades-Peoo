import java.util.Scanner;
public class Questao08 {
	/* Autora: Fernanda Jamily Aquino Silva*/
	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	int i = 1;
	System.out.println("Digite um número para saber a tabuada: ");
	int numero = leia.nextInt();
	while(i <= 10) {
	System.out.format("%d x %d = %d\n" , numero, i, (numero * i));	
	i++;
	}
	}

}
