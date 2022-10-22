package testaroqueonetbensnaotesta;
import java.util.Scanner;
public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner (System.in);
		ConversorMoeda b1 = new ConversorMoeda();
	      double n1 = leia.nextDouble();
	      
	      b1.converter(n1);
	      System.out.println(b1.converter(n1));
	}

}
