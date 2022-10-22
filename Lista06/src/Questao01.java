import java.util.Scanner;
public class Questao01 {

	public static void main(String[] args) {
		Scanner leia =  new Scanner(System.in);
	    System.out.println("Digite o primeiro número:");
	    double valor1 = leia.nextDouble();
	    System.out.println("Digite o segundo número: ");
	    double valor2 = leia.nextDouble();
	    double soma = somar(valor1, valor2);
	    System.out.println("A soma: " + soma);
	    double sub = subtracao(valor1, valor2);
	    System.out.println("A subtração: " + sub);
	    double multi = multiplica(valor1, valor2);
	    System.out.println("A multipicação: " + multi);
	    double divi = divisao (valor1, valor2);
	    System.out.println("A divisão: " + divi);
	    }
	    static double somar(double valor1, double valor2) {
	    return valor1 + valor2;
	    }
	    static double subtracao(double valor1, double valor2) {
	    return valor1 - valor2;
	    }
	    static double multiplica(double valor1, double valor2) {
	    return valor1 * valor2;
	    }
	    static double divisao(double valor1, double valor2) {
	    return valor1 / valor2;
	    }

	}


