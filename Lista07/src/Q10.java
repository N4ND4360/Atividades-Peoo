
public class Q10 {

	public static void main(String[] args) {
		String frase = "Aprender JAVA é muito bom!";
		String[] vetor = frase.split(" ");
		StringBuilder f = new StringBuilder("");
		for(int i = 0; i < vetor.length; i++) {
			f.append(vetor[i]);
			f.append(" ");
		}
		System.out.println(f);

	}

}
