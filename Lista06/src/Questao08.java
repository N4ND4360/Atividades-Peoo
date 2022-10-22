
public class Questao08 {

	public static void main(String[] args) {
    String[] dupla = {"João Lucas", "Fernanda Jamily"};
		
		reverter(dupla);
		for(int i = 0; i < dupla.length; i++) {
			System.out.println(dupla[i]);
		}
		

	}
	static void reverter(String[] dupla) {
		int j = 0;
		String[] tmp = new String[dupla.length];
		for(int i = dupla.length - 1; i >= 0; i--) {
			tmp[i] = dupla[i];
			dupla[i] = dupla[j];
			dupla[j] = tmp[i];
			
		}
		
	}

}

	
