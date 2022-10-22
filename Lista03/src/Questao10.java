import java.util.Scanner;
public class Questao10 {
	/* Autora: Fernanda Jamily Aquino Silva*/
	public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n[]=new int [10];
    int res=1;
    System.out.println("Digite 10 valores inteiros:");
    for(int i=0;i<10;) {
	n[i]=s.nextInt();
	if (n[i]>=0 && n[i]<=100) {
	res=n[i];
	System.out.println(+res+ " Está entre 0 e 100. ");
	}else {
	System.out.println(+res+ " Não está entre 0 e 100. " );
	 }
    }
  }
}
