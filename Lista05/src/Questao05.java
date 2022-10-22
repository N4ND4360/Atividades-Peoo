import java.util.Scanner;
public class Questao05 {

	public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);
		
		double[][] tabela = new double[3][3];
		int aluno = 1;
		
		for(int i = 0; i < tabela.length; i++) {
			int nota = 1;
			System.out.println("ALUNO " + aluno + ": ");
			
			for(int j = 0; j < tabela[i].length; j++) {
				System.out.println("Digite a nota " + nota + ":");
				tabela[i][j] = leia.nextDouble();
				nota++;
				
			}
			aluno++;
		}
		System.out.println();
		System.out.println("A    N1     N2     N3     MF     C ");
		aluno = 1;
		for(int i = 0; i < tabela.length; i++) {
			double mf = 0.0;
			
			System.out.print(aluno + "| ");
			for(int j = 0; j < tabela[i].length; j++) {
				if (j == 0 || j == 1) {
					mf = mf + (tabela[i][j] * 0.4);
					
				} else if(j == 2) {
					mf = mf + (tabela[i][j] * 0.2);
					
				}
				System.out.print("|"+ tabela[i][j] + "| ");
				
			}
			System.out.printf("|%.1f|  ", mf);
			
			if (mf >= 9.0) {
				System.out.println("|A|");	
			}
			if (mf >= 7.5 && mf < 9.0) {
				System.out.println("|B|");
			}
			if (mf >= 6.0 && mf < 7.5) {
				System.out.println("|C|");
			}
			if (mf >= 3.0 && mf < 6.0) {
				System.out.println("|R|");
			}
			if (mf < 3.0) {
				System.out.println("|D|");
			}
			aluno++;
		}
		

	}

}
