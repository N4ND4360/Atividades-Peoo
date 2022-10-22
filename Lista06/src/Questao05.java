import java.util.Scanner;
public class Questao05 {

	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
    System.out.println("Digite um número maior que 1: ");
    int n = leia.nextInt();
    boolean resul = retorno(n);
    System.out.println(n + " é primo?");
    System.out.println(resul);
    }
    static boolean retorno(int n) {
    int divisor = 1;
    int primo = 0;
    while (divisor <= n) {
	if (n % divisor == 0) {
	primo++;
	}
	divisor++;
    }

    if(primo == 2) {
	return true;
    }
    else if(primo > 2){
	return false;
    }
    return true;
}
}