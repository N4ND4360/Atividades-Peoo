
public class Q03 {

	public static void main(String[] args) {
		String nome = "ABRACADABRA";
		char[] vetor = nome.toCharArray();
		for(int i = vetor.length - 1; i >= 0; i--) {
			System.out.print(vetor[i]);
		}
	}

}
