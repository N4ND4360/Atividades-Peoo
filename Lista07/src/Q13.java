import java.util.Scanner;
public class Q13 {

	public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite seu n�mero de telefone com DDD e sem espa�o ou s�mbolo:");
		String numero = leia.nextLine();
		
		StringBuilder tel = new StringBuilder(numero);
		if (numero.length() != 11) {
			System.out.println("� IMPOSS�VEL FORMATAR O N�MERO");
		} else {
			tel = tel.insert(0, "(");
			tel = tel.insert(3, ") ");
			tel = tel.insert(10, "-");
			System.out.print("O n�mero formatado: ");
			System.out.println(tel);
			
		}

	}

}
