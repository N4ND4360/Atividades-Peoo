import java.util.Scanner;

public class Questao10 {

	public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);
		int indice = 0;
		double[] vetor = new double[5];
		for( int i = 0; i < vetor.length;i++) {
		System.out.println("Preencha o vetor: ");
		vetor [i] = leia.nextDouble();
		indice = i;
		}
		System.out.println("Qual n�mero voc� quer saber se est� l�: ");
		double n = leia.nextDouble();
		
		
		boolean resul = procurar(vetor, n, indice);
		if (resul == true) {
			System.out.println(n + " est� na posi��o " + indice);
		}
		if(resul == false)
			System.out.println("-1");
	}
	static boolean procurar (double[] vetor, double n, int indice) {
		int nEncontrado = 0; 
		for(int i = 0; i < vetor.length; i++) {
			if (vetor[i] == n) {
				indice = i;
				return true;
			}
		}
	if (nEncontrado == 0) {
	n = -1;
    return false;
	}	
		return false;
	}

	}


