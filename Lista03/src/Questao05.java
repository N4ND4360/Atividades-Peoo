import java.util.Scanner;
public class Questao05 {
	/* Autora: Fernanda Jamily Aquino Silva*/
	public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);	
	int idade = 0, nAluno = 0, aluno = 0, resp = 0;
	float media = 0;
    do{
    nAluno += 1;
    System.out.println("Digite sua idade: ");
	idade = leia.nextInt();
    aluno += idade;
    System.out.println("Pretende continuar? [1-Sim]/[2-Não]");
    resp = leia.nextInt(); }
    while(resp == 1);
    media = aluno/nAluno;
         System.out.println("A media das idade vale: " + media);

		 }

	}


