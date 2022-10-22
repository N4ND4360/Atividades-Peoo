
package br.edu.ifrn.peoo.aulas.arquivos.atividade1;

public class Filme {
        private String nome;
	private String ano;
	private int classificacao;

    public Filme(String nome, String ano, int classificacao) {
        this.nome = nome;
        this.ano = ano;
        this.classificacao = classificacao;
    }
	
        

	
	public void setNome(String nome) {
		this.nome = nome;	
	}
	public String getNome() {
		return nome;
	}
	
	public void setAno(String ano) {
		this.ano = ano;
	} 
	public String getAno() {
		return ano;
	}
	public void setClassificacao(int classificacao) {
		this.classificacao = classificacao;
	}
	public int getClassificacao() {
		return classificacao;
	}

    @Override
    public String toString() {
        return "Filme{" + "nome=" + nome + ", ano=" + ano + ", classificacao=" + classificacao + '}';
    }
        
}
