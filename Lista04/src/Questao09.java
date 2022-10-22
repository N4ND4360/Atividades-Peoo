import java.util.Scanner;
public class Questao09 {
	/* Autora: Fernanda Jamily Aquino Silva*/
	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
    int vetor[] = new int [90];
    int acm = 0 ;
    int acm2 = 0;
    int cont = 0; 
    for (int i = 0; i < vetor.length; i++) {
    System.out.println("Digite as horas que você acessa a internet: ");
    vetor[i] = leia.nextInt();
    if(vetor[i]>=100) {
    acm = acm +1;
    }
    if(vetor[i]<= 99) {
    cont = cont + 1;	
    }
    if(vetor[i]<=10) {
    acm2 = acm2 +1;
    }
    }
    System.out.println(acm + " alunos usam a internet por mais de 100 horas.");
    System.out.println(acm2 + " alunos usam a internet por menor de 10 horas e está menor que 100 horas.");
	System.out.println(cont + " alunos usam a internet menos de 100 horas.");
	}

}
