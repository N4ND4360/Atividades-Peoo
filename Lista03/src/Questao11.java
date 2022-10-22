import java.util.Scanner;
public class Questao11 {
	/* Autora: Fernanda Jamily Aquino Silva*/
	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	System.out.println("Digite um número natural: ");
	int n = leia.nextInt();
	int cont = 0;
	int x = 0;
	while(x <= n) {
	x++;
	if(n % x == 0) {
	cont = cont + 1;
	 }
	}
	if(cont == 2) {
	System.out.println("O número digitado é primo!!");
	}else {
	System.out.println("O número digitado não é primo!!");
	}
  }
}
