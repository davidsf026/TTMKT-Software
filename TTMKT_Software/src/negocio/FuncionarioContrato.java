package negocio;

public class FuncionarioContrato {
	//DECLARA��O DE VARI�VEIS
	private String codigoDoContrato = "";
	private String cpfDoFuncionario = "";
	//M�TODO CONSTRUTOR VAZIO
	public FuncionarioContrato() {
		super();
	}
	//M�TODO CONSTRUTOR CHEIO
	public FuncionarioContrato(String codigoDoContrato, String cpfDoFuncionario) {
		super();
		this.codigoDoContrato = codigoDoContrato;
		this.cpfDoFuncionario = cpfDoFuncionario;
	}
	//METODOS GET/SET DA CLASSE
	public String getCodigoDoContrato() {
		return codigoDoContrato;
	}

	public void setCodigoDoContrato(String codigoDoContrato) {
		this.codigoDoContrato = codigoDoContrato;
	}

	public String getCpfDoFuncionario() {
		return cpfDoFuncionario;
	}

	public void setCpfDoFuncionario(String cpfDoFuncionario) {
		this.cpfDoFuncionario = cpfDoFuncionario;
	}
	
	
}
