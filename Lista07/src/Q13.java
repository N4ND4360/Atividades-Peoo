import java.util.Scanner;
public class Q13 {

	public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite seu número de telefone com DDD e sem espaço ou símbolo:");
		String numero = leia.nextLine();
		
		StringBuilder tel = new StringBuilder(numero);
		if (numero.length() != 11) {
			System.out.println("É IMPOSSÍVEL FORMATAR O NÚMERO");
		} else {
			tel = tel.insert(0, "(");
			tel = tel.insert(3, ") ");
			tel = tel.insert(10, "-");
			System.out.print("O número formatado: ");
			System.out.println(tel);
			
		}

	}

}
