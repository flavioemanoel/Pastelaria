package gerenciadores;

import java.util.ArrayList;
import java.util.List;

import excecao.ExcecaoPastelaria;


import negocio.Produto;

public class GerenteDeEstoquePastelaria {

	private List<Produto> listaDeProdutos = new ArrayList<Produto>();

	public void cadastrarNovoProduto(Produto p) {

		for (int i = 0; i < listaDeProdutos.size(); i++) {
			if (this.listaDeProdutos.get(i).getCodigo() == p.getCodigo()) {
				throw new ExcecaoPastelaria("O c�digo do produto j� existe");
			}
		}
		this.listaDeProdutos.add(p);
	}

	public Produto pesquisarProduto(String codigo) {

		for (int i = 0; i < listaDeProdutos.size(); i++) {
			if (this.listaDeProdutos.get(i).getCodigo().equals(codigo)) {
				return this.listaDeProdutos.get(i);
			}
		}
		throw new ExcecaoPastelaria("O produto n�o existe");
	}

	public void atualizarQtdeProduto(String codigo, int qtde) {

		for (int i = 0; i < listaDeProdutos.size(); i++) {
			if (this.listaDeProdutos.get(i).getCodigo() == codigo) {
				int aux= listaDeProdutos.get(i).getQtdeProduto();
				listaDeProdutos.get(i).setQtdeProduto(aux+qtde);
			}
		}

	}
	
	
	
	public boolean isRemoverProduto(String codigo) {
		
		Produto p = this.pesquisarProduto(codigo);
		
		if(p!=null){
			this.listaDeProdutos.remove(p);
			return true;
		}else{
			
			throw new ExcecaoPastelaria("O produto n�o existe");
		}
	}

	public void diminuirQtdeProduto(String codigo) {
		
		for (int i = 0; i < listaDeProdutos.size(); i++) {
			if (this.listaDeProdutos.get(i).getCodigo() == codigo) {
				int aux= listaDeProdutos.get(i).getQtdeProduto();
				listaDeProdutos.get(i).setQtdeProduto(aux-1);
			}
		}
		
	}
	
	public String visualizarProduto() {
		
		return listaDeProdutos.toString() ;
	}

	public void atualizarCodigoProduto(String codigo, String novoCod) {
		
		for (Produto produto : listaDeProdutos){
			if (produto.getCodigo().equals(codigo)){
				produto.setCodigo(novoCod);
			}
		}
	}

	public void atualizarNomeProduto(String codigo, String nome) {
		// TODO Auto-generated method stub
		for (Produto produto : listaDeProdutos){
			if (produto.getCodigo().equals(codigo)){
				produto.setNome(nome);
			}
		}
		
	}

	public void atualizarPrecoProduto(String codigo, double precoAtual) {
		// TODO Auto-generated method stub
		for (Produto produto : listaDeProdutos){
			if (produto.getCodigo().equals(codigo)){
				produto.setPreco(precoAtual);
			}
		}
	}

}
