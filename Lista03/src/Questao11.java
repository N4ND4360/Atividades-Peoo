import java.util.Scanner;
public class Questao11 {
	/* Autora: Fernanda Jamily Aquino Silva*/
	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	System.out.println("Digite um n�mero natural: ");
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
	System.out.println("O n�mero digitado � primo!!");
	}else {
	System.out.println("O n�mero digitado n�o � primo!!");
	}
  }
}
