import java.util.Scanner;
public class Questao06 {

	public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);
    System.out.print("Digite um número natural --> ");
    int n = leia.nextInt();
    System.out.println(n + "! = " + fatorial(n));
    }
	static int fatorial (int n) {
	int f = 1;
	for(int i = 1; i <= n; i++) {
	f *= i;
	}
	if(n == 0 || n == 1) {
	f = 1;
	}
	return f;
	}
	}

	


