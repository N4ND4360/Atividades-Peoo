import java.util.Scanner;
public class Questao13 {
	/*Autora : Fernanda Jamily Aquino Silva */
	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
    int [] vetorA1= new int[8];
	int [] vetorA2 = new int[vetorA1.length];
	int valorVetorA1 = 0;
	int valorVetorA2 = 0;
	for (int i = 0; i < vetorA1.length; i++) {
	System.out.format("Digite o %d elemento do vetor 1: ", (i+1));
	vetorA1[i] = leia.nextInt();
	}
	System.out.println(""); 
	for (int i = 0;i < vetorA2.length; i++){
	System.out.printf("Digite o %d elemento do vetor 2: ", (i+1));
	vetorA2[i] = leia.nextInt();
	} 
	for (int i = 0; i < vetorA1.length; i++) {
	valorVetorA1 = vetorA2[i];
	vetorA2[i] = valorVetorA1;
	System.out.format ("%nVetorA1[%d]= %d", i, vetorA2[i]);
	}
	System.out.println("");  
	for (int i = 0; i < vetorA1.length; i++) { 
	valorVetorA2 = vetorA1[i];
	vetorA1[i] = valorVetorA2;
	System.out.format ("%nVetorA2[%d]= %d", i, vetorA1[i]);
	}
	}
    }
