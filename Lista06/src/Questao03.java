import java.util.Scanner;
public class Questao03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o valor do raio: ");
		double raio = leia .nextDouble();
	    System.out.println("A área do cículo: " + areac(raio));
		}
		static double areac(double raio) {
		return 3.14 * Math.pow(raio, 2);
		}
		}

