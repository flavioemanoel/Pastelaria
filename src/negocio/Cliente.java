package negocio;

public class Cliente {

	private String nome;
	private String telefone;
	private String endereco;
	private String pontoRef;
	
	public Cliente(String nome, String telefone, String endere�o, String pontoRef) {
		
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endere�o;
		this.pontoRef = pontoRef;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndere�o() {
		return endereco;
	}

	public void setEndere�o(String endere�o) {
		this.endereco = endere�o;
	}

	public String getPontoRef() {
		return pontoRef;
	}

	public void setPontoRef(String pontoRef) {
		this.pontoRef = pontoRef;
	}
	
}

