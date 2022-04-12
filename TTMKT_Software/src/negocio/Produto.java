package negocio;

import java.util.Collection;

import persistencia.ProdutoDAO;

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
	
	//M�TODO GET TODOS DO BANCO DE DADOS
	public static Collection<Produto> getTodos() throws Exception {
		return new ProdutoDAO().getTodos();		
	}
	
	//M�TODO PERSISTIR NO BANCO DE DADOS
	public void persistir() throws Exception {
		new ProdutoDAO().persistir(this);
	}
}
