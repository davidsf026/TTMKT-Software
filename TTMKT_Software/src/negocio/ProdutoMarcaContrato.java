package negocio;

public class ProdutoMarcaContrato {
	//DECLARA��O DE VARI�VEIS
	private String codigoProdutoMarca = "";
	private String codigoDoContrato = "";
	
	//M�TODO CONSTRUTOR VAZIO
	public ProdutoMarcaContrato() {
		super();
	}
	
	//M�TODO CONSTRUTOR CHEIO
	public ProdutoMarcaContrato(String codigoProdutoMarca, String codigoDoContrato) {
		super();
		this.codigoProdutoMarca = codigoProdutoMarca;
		this.codigoDoContrato = codigoDoContrato;
	}
	
	//METODOS GET/SET DA CLASSE
	public String getCodigoProdutoMarca() {
		return codigoProdutoMarca;
	}

	public void setCodigoProdutoMarca(String codigoProdutoMarca) {
		this.codigoProdutoMarca = codigoProdutoMarca;
	}

	public String getCodigoDoContrato() {
		return codigoDoContrato;
	}

	public void setCodigoDoContrato(String codigoDoContrato) {
		this.codigoDoContrato = codigoDoContrato;
	}
}
