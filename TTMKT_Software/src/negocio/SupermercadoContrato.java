package negocio;

import java.util.Collection;

import persistencia.SupermercadoContratoDAO;

public class SupermercadoContrato {
	//DECLARA��O DE VARI�VEIS
	private String cnpjDoSupermercado = "";
	private String codigoDoContrato = "";
	
	//M�TODO CONSTRUTOR VAZIO
	public SupermercadoContrato() {
		super();
	}
	
	//M�TODO CONSTRUTOR CHEIO
	public SupermercadoContrato(String cnpjDoSupermercado, String codigoDoContrato) {
		super();
		this.cnpjDoSupermercado = cnpjDoSupermercado;
		this.codigoDoContrato = codigoDoContrato;
	}
	
	//METODOS GET/SET DA CLASSE
	public String getCnpjDoSupermercado() {
		return cnpjDoSupermercado;
	}

	public void setCnpjDoSupermercado(String cnpjDoSupermercado) {
		this.cnpjDoSupermercado = cnpjDoSupermercado;
	}

	public String getCodigoDoContrato() {
		return codigoDoContrato;
	}

	public void setCodigoDoContrato(String codigoDoContrato) {
		this.codigoDoContrato = codigoDoContrato;
	}


//M�TODO GET TODOS DO BANCO DE DADOS
	public static Collection<SupermercadoContrato> getTodos() throws Exception {
		return new SupermercadoContratoDAO().getTodos();		
	}
	
	//M�TODO PERSISTIR NO BANCO DE DADOS
	public void persistir() throws Exception {
		new SupermercadoContratoDAO().persistir(this);
	}
}