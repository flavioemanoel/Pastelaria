package pastelaria;

public class Cliente {
	
	private String nome;
	private String telefone;
	private String enderešo;
	private String pontoRef;
	
	public Cliente(String nome, String telefone, String enderešo, String pontoRef) {
		
		this.nome = nome;
		this.telefone = telefone;
		this.enderešo = enderešo;
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
		return enderešo;
	}

	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
	}

	public String getPontoRef() {
		return pontoRef;
	}

	public void setPontoRef(String pontoRef) {
		this.pontoRef = pontoRef;
	}
	
	
	
	
	

}
