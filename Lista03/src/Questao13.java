
public class Questao13 {
	/* Autora: Fernanda Jamily Aquino Silva*/
	public static void main(String[] args) {
	double chico = 1.50;
	double ze = 1.10;
	int anos = 1;
    while (chico >= ze) {
    chico = chico + 0.03;
    ze = ze + 0.05;
    anos = anos + 1;
   	}
    System.out.println("Para Zé ficar do tamanho de chico vai demora "+(anos)+" anos.");
    }
}
