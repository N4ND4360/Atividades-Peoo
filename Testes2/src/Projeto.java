import java.util.ArrayList;
// A) Agregação
public class Projeto {
	private String nome;
	private int codigo;
	private ArrayList<Desenvolvedor> desenvolvedores;
	public Projeto (){
	desenvolvedores = new ArrayList<>();
	}
    public Projeto(String nome, int codigo) {
    this.nome = nome;
    this.codigo = codigo;
    desenvolvedores = new ArrayList<>();
    }
	public void setNome(String nome){
	this.nome = nome;
	}
	public String getNome() {
	return nome;   
	}
	public void setCodigo(int codigo){
	this.codigo = codigo;
	}
	public int getCodigo() {
	return codigo;   
	}
	public void adicionar(Desenvolvedor a){
	desenvolvedores.add(a);
	}
	public ArrayList<Desenvolvedor> getDesenvolvedores() {
	return desenvolvedores;
	}
}
