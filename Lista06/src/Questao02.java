import java.util.Scanner;
public class Questao02 {

	public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);
    System.out.println("Qual o tamanho do raio?");
    double r = leia.nextDouble();
	System.out.println("O perímetro do círculo é: " + perimetro(r));
	}
	static double perimetro (double raio) {
	return 2 * 3.14 * raio;
	}

	}

