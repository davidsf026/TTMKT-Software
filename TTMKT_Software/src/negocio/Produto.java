package negocio;

public class Produto {
	//DECLARA��O DE VARI�VEIS
	private String codigoDoProduto = "";
	private String nome = "";
	
	//M�TODO CONSTRUTOR VAZIO
	public Produto() {
		super();
	}
	
	//M�TODO CONSTRUTOR CHEIO
	public Produto(String codigoDoProduto, String nome) {
		super();
		this.codigoDoProduto = codigoDoProduto;
		this.nome = nome;
	}
	
	//METODOS GET/SET DA CLASSE
	public String getCodigoDoProduto() {
		return codigoDoProduto;
	}

	public void setCodigoDoProduto(String codigoDoProduto) {
		this.codigoDoProduto = codigoDoProduto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}	
}
