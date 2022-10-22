import java.util.Scanner;

public class TesteLampada {

	public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);
    Lampada objlampada = new Lampada();
     
    System.out.println("Digite o tipo da lampada");
    String tipo = leia.next();
    objlampada.setTipo(tipo);
    
    System.out.println();
	}

}
