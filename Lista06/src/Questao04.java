import java.util.Scanner;
public class Questao04 {

	public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);
    System.out.print("Digite um número natural --> ");
    int n = leia.nextInt();
    System.out.println(n + " tem " + divisores(n) + " divisores naturais");
    }
	static int divisores(int n) {
    int cDivisores = 0;
	for(int i = 1; i <= n; i++)
	if(n % i == 0) {
	cDivisores++;
	}
	return cDivisores;
	}
	}


