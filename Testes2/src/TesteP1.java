import java.util.ArrayList;

public class TesteP1 {

	public static void main(String[] args) {
    
	Projeto pi1 = new Projeto();
	pi1.setNome("[  Projeto integrador  ]");
	pi1.setCodigo(18242004);
    
	Desenvolvedor joao = new Desenvolvedor("João Alisson Câmara", 14000.00);
    
    Desenvolvedor renato = new Desenvolvedor();
    renato.setNome("Renato Douglas Silva");
    renato.setSalario(1000.0);
    
    Desenvolvedor fernanda = new Desenvolvedor("Fernanda Beatriz Santos", 182345.0);
    
    pi1.adicionar(joao);
    pi1.adicionar(fernanda);
    
    System.out.println(pi1.getNome());
    System.out.println("Código: " + pi1.getCodigo());
    
    ArrayList<Desenvolvedor> devs = pi1.getDesenvolvedores();
   
    for (int i = 0; i < devs.size(); i++) {
    
    System.out.println(devs.get(i));
    
    }
    System.out.println();
    System.out.println(renato.toString());
	}
	

}
