import java.util.Scanner;
public class Questao09 {

	public static void main(String[] args) {
		  Scanner leia = new Scanner(System.in);
		  double [] vetor = new double[5];
		  double num = 0;
		  for(int i = 0; i < vetor.length; i++) {
		  System.out.println("Preencha o vetor: ");
		  vetor[i] = leia.nextDouble();
		  }
		  System.out.println("Digite um número que deseja sabe se pertence ao vetor: ");
		  num = leia.nextDouble();
		  System.out.println(num + " está no vetor? ");
		  boolean resultado = retorno(vetor,num);
		  System.out.print(resultado);
		  }
		  static boolean retorno(double [] vetor, double num){
	      int nEncontrado = 0;
	      for (int i = 0; i < vetor.length; i++) {
		  if(vetor [i] == num){
		  return true;
		  }
	      }
		  if(nEncontrado == 0) {
		  num = -1;
		  return false;
		  }
		  
	      return false;
		  }
		  }