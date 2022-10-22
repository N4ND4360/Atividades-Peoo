import java.util.Scanner;
public class Questao04 {
	 /* Autora: Fernanda Jamily Aquino Silva*/
	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	double [] notas = new double [3];
	double soma = 0;
	double media = 0;
	int quantidade = 0;
	for (int i = 0; i < notas.length; i++) {
	System.out.println("Digite sua nota: ");
	notas[i] = leia.nextInt();
	soma = soma + notas[i];
	media = soma/notas.length;
	if(notas[i]>=7) {
	quantidade= quantidade + 1;
	System.out.println("Nota do aluno aprovado: " + notas[i]);
	}
	}
	System.out.println("A média da turma é: " + "[ "+ media + " ]");
	System.out.println("A quantidade de alunos aprovados é: " + "[ " + quantidade + " ]");
	}
    }


