package negocio;

public class Cliente {

	private String nome;
	private String telefone;
	private String endereco;
	private String pontoRef;
	
	public Cliente(String nome, String telefone, String enderešo, String pontoRef) {
		
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = enderešo;
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

	public String getEnderešo() {
		return endereco;
	}

	public void setEnderešo(String enderešo) {
		this.endereco = enderešo;
	}

	public String getPontoRef() {
		return pontoRef;
	}

	public void setPontoRef(String pontoRef) {
		this.pontoRef = pontoRef;
	}
	
}

