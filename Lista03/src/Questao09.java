public class Questao09 {
	/* Autora: Fernanda Jamily Aquino Silva*/
	public static void main(String[] args) {
		int divisor=0, soma=0;
        for (int i=12;i<=873;i++){
		if (i%2==0){
		divisor++;
		soma+=i; 
		}
		}
		System.out.println("A divisão é: " + soma/divisor);
		}
		}
