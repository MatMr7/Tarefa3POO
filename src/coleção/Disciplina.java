package coleção;

public class Disciplina implements selecionavel{
	
	private String nome;
	
	
	public Disciplina(String nome ) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}

}
