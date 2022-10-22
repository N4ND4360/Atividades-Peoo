import java.util.Scanner;
public class Questao04 {
	/* Autora: Fernanda Jamily Aquino Silva*/
	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);	
	int n;
	System.out.println("Digite um número natural: ");
	n = leia.nextInt();
	System.out.println("");
	System.out.println("Divisores do seu número: ");
	
	for (int i = 1; i <=1000; i ++) {
	if(n % i == 0) {
	System.out.println("");
	System.out.println(i);
	        	}
	        }

	}

}
