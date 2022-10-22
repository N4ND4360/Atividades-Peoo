import java.util.Random;
public class Questao14 {
	/* Autora: Fernanda Jamily Aquino Silva*/
	public static void main(String[] args) {
	Random gerador = new Random();
	int res=0;
	System.out.println("O resultado é: ");
	for(int i = 0; i < 20; i++) {
    int x = gerador.nextInt(3000); 
    res = x/11;
    if (res % 5 == 0) {
    }
    System.out.println("");
    System.out.println(res);
	}
	}

}
