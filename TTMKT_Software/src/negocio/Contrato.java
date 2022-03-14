package negocio;

import java.sql.Date;

public class Contrato {
	//DECLARA��O DE VARI�VEIS
	private String codigoDoContrato = "";
	private Date dataDeInicio = null;
	private Date dataDeTermino = null;
	//M�TODO CONSTRUTOR VAZIO
	public Contrato() {
		super();
	}
	//M�TODO CONSTRUTOR CHEIO
	public Contrato(String codigoDoContrato, Date dataDeInicio, Date dataDeTermino) {
		super();
		this.codigoDoContrato = codigoDoContrato;
		this.dataDeInicio = dataDeInicio;
		this.dataDeTermino = dataDeTermino;
	}
	//METODOS GET/SET DA CLASSE
	public String getCodigoDoContrato() {
		return codigoDoContrato;
	}

	public void setCodigoDoContrato(String codigoDoContrato) {
		this.codigoDoContrato = codigoDoContrato;
	}

	public Date getDataDeInicio() {
		return dataDeInicio;
	}

	public void setDataDeInicio(Date dataDeInicio) {
		this.dataDeInicio = dataDeInicio;
	}

	public Date getDataDeTermino() {
		return dataDeTermino;
	}

	public void setDataDeTermino(Date dataDeTermino) {
		this.dataDeTermino = dataDeTermino;
	}
	
	
}
