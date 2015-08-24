package br.com.julianfernando.controle;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import br.com.julianfernando.modelo.Produto;

@ManagedBean
@ApplicationScoped
public class ProdutoBean {
	
	private Produto produto = new Produto();
	
	private List<Produto> produtos = new ArrayList<Produto>();

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}
	
	public void adiciona() {
		
		this.produtos.add(getProduto());
		
		this.produto = new Produto();
	}
}
