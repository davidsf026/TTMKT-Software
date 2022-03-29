package negocio;

public class Marca {
	//DECLARA��O DE VARI�VEIS
	private String cnpjDaMarca = "";
	private String telefone = "";
	private String email = "";
	private String nome = "";
	
	//M�TODO CONSTRUTOR VAZIO
	public Marca() {
		super();
	}
	
	//M�TODO CONSTRUTOR CHEIO
	public Marca(String cnpjDaMarca, String telefone, String email, String nome) {
		super();
		this.cnpjDaMarca = cnpjDaMarca;
		this.telefone = telefone;
		this.email = email;
		this.nome = nome;
	}
	
	//METODOS GET/SET DA CLASSE
	public String getCnpjDaMarca() {
		return cnpjDaMarca;
	}

	public void setCnpjDaMarca(String cnpjDaMarca) {
		this.cnpjDaMarca = cnpjDaMarca;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
