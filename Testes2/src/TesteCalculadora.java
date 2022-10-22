import java.util.Scanner;

public class TesteCalculadora {

	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	
	System.out.println("Digite o primeiro número: ");
	double numero1 = leia.nextDouble();
	System.out.println("Digite o primeiro número: ");
	double numero2 = leia.nextDouble();
  
	double soma1 = Calculadora.Soma(numero1, numero2);
	double sub1 = Calculadora.Sub(numero1, numero2);
	double multi1 = Calculadora.Multi(numero1, numero2);
	double divi1 = Calculadora.Divi(numero1, numero2);
	
	System.out.println(" A soma é: " + soma1 );
	System.out.println(" A subtração é: " + sub1 );
	System.out.println(" A multiplicação é: " + multi1 );
	System.out.println(" A Divisão é: " + divi1 );
		}
	
	}

